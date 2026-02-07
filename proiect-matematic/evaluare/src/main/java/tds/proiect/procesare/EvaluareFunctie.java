package tds.proiect.evaluare.procesare;

import java.util.ArrayList;
import java.util.List;

import tds.proiect.evaluare.date.RezultatEvaluare;
import tds.proiect.matematic.functii.Functie;
import tds.proiect.matematic.model.SetValori;
import tds.proiect.matematic.model.ValoareX;

public class EvaluareFunctie {

    private Functie functie;
    private SetValori setValori;

    public EvaluareFunctie(Functie functie, SetValori setValori) {
        this.functie = functie;
        this.setValori = setValori;
    }

    public List<RezultatEvaluare> evalueaza() {
        List<RezultatEvaluare> rezultate = new ArrayList<>();

        List<ValoareX> valoriX = setValori.getValori();

        for (int i = 0; i < valoriX.size(); i++) {
            double x = valoriX.get(i).getX();
            double valoare = functie.calculeaza(x);
            rezultate.add(new RezultatEvaluare(x, valoare));
        }

        return rezultate;
    }
}
