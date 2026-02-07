package tds.proiect.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import tds.proiect.matematic.creator.CreatorFunctie;
import tds.proiect.matematic.functii.Functie;
import tds.proiect.matematic.model.SetValori;
import tds.proiect.matematic.model.ValoareX;
import tds.proiect.evaluare.procesare.EvaluareFunctie;
import tds.proiect.evaluare.date.RezultatEvaluare;
import tds.proiect.exceptie.FunctieInvalidaException;

@WebServlet("/evaluare")
public class EvaluareServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            // Citire parametri
            String tip = request.getParameter("tip");
            double a = Double.parseDouble(request.getParameter("a"));
            double b = Double.parseDouble(request.getParameter("b"));
            double c = 0;
            if ("patratica".equals(tip)) {
                c = Double.parseDouble(request.getParameter("c"));
            }

            // Citire valori X 
            String valoriXText = request.getParameter("valoriX");
            List<ValoareX> valori = new ArrayList<>();

            for (String s : valoriXText.split(",")) {
                double x = Double.parseDouble(s.trim());
                valori.add(new ValoareX(x));
            }
            SetValori setValori = new SetValori(valori);

            // Creare functie
            CreatorFunctie creator = new CreatorFunctie();
            Functie functie = creator.creeaza(tip, a, b, c);

            // Evaluare
            EvaluareFunctie evaluare = new EvaluareFunctie(functie, setValori);
            List<RezultatEvaluare> rezultate = evaluare.evalueaza();

            // Trimitere la JSP
            request.setAttribute("functie", functie.toString());
            request.setAttribute("rezultate", rezultate);

            request.getRequestDispatcher("/rezultat.jsp").forward(request, response);

        } catch (FunctieInvalidaException | NumberFormatException e) {
            request.setAttribute("eroare", e.getMessage());
            request.getRequestDispatcher("/eroare.jsp")
                   .forward(request, response);
        }
    }
}
