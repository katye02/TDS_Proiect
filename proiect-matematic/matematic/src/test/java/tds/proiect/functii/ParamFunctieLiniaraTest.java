package tds.proiect.matematic.functii;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParamFunctieLiniaraTest {

    private double a;
    private double b;
    private double x;
    private double rezultatAsteptat;

    // Constructorul primește un set de date
    public ParamFunctieLiniaraTest(double a, double b, double x, double rezultatAsteptat) {
        this.a = a;
        this.b = b;
        this.x = x;
        this.rezultatAsteptat = rezultatAsteptat;
    }

    // Seturile de date de test
    @Parameters
    public static List<Object[]> dateTest() {
        return Arrays.asList(new Object[][] {
            { 1, 2, 3, 5 },  
            { 2, 3, 4, 11 },  
            { 0, 5, 10, 5 },  
            { -1, 1, 2, -1 }  
        });
    }

    @Test
    public void testFunctieLiniaraParametrizat() {
        FunctieLiniara functie = new FunctieLiniara(a, b);
        System.out.println("Test f(x) = " + a + "*x + " + b + " pentru x = " + x + " → asteptat = " + rezultatAsteptat);
        assertEquals(rezultatAsteptat, functie.calculeaza(x), 0.0001);
    }
}
