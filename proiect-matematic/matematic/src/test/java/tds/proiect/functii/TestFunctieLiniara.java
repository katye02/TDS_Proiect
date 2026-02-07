package tds.proiect.matematic.functii;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFunctieLiniara {

    FunctieLiniara functie = new FunctieLiniara(2, 3);
    double rezultatAsteptat = 11;
    double x = 4;

    @Test
    public void testCalculeaza() {
        System.out.println("Test functie liniara...");
        assertEquals(rezultatAsteptat, functie.calculeaza(x), 0.0001);
    }
}
