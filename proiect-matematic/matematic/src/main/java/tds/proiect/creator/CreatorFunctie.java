package tds.proiect.matematic.creator;

import tds.proiect.matematic.functii.Functie;
import tds.proiect.matematic.functii.FunctieLiniara;
import tds.proiect.matematic.functii.FunctiePatratica;
import tds.proiect.exceptie.FunctieInvalidaException;

public class CreatorFunctie {

    public Functie creeaza(String tip, double a, double b, double c)
            throws FunctieInvalidaException {

        if ("liniara".equals(tip)) {
            return new FunctieLiniara(a, b);
        }

        if ("patratica".equals(tip)) {
            return new FunctiePatratica(a, b, c);
        }

        throw new FunctieInvalidaException("Tip de functie necunoscut");
    }
}
