package tds.proiect.matematic.functii;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFunctiePatratica {

    FunctiePatratica functie = new FunctiePatratica(1, 2, 1);
    double x = 2;
    double rezultatAsteptat = 9;

    @Test
    public void testCalculeaza() {
        System.out.println("Test functie patratica...");
        assertEquals(rezultatAsteptat, functie.calculeaza(x), 0.0001);
    }
}
