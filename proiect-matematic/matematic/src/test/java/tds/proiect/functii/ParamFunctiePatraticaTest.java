package tds.proiect.matematic.functii;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamFunctiePatraticaTest {

    private double a, b, c, x, rezultatAsteptat;

    public ParamFunctiePatraticaTest(double a, double b, double c, double x, double rezultatAsteptat) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
        this.rezultatAsteptat = rezultatAsteptat;
    }

    @Parameters
    public static List<Object[]> dateTest() {
        return Arrays.asList(new Object[][] {
            { 1, 0, 0, 2, 4 }, 
            { 1, 2, 1, 2, 9 },
            { 2, 0, 0, 3, 18 }, 
            { 1, -1, 0, 3, 6 }   
        });
    }

    @Test
    public void testFunctiePatraticaParametrizat() {
        FunctiePatratica functie = new FunctiePatratica(a, b, c);
        System.out.println("Test f(x) = " + a + "*x^2 + " + b + "*x + " + c + " pentru x = " + x + " → asteptat = " + rezultatAsteptat);
        assertEquals(rezultatAsteptat, functie.calculeaza(x), 0.0001);
    }
}
