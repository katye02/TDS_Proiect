package tds.proiect.evaluare;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tds.proiect.evaluare.procesare.EvaluareFunctie;
import tds.proiect.evaluare.date.RezultatEvaluare;
import tds.proiect.matematic.functii.FunctieLiniara;
import tds.proiect.matematic.model.SetValori;
import tds.proiect.matematic.model.ValoareX;

public class EvaluareFunctieTest {

    private EvaluareFunctie evaluare;

    @Before
    public void setUp() {
        System.out.println("@Before: initializare evaluare");

        FunctieLiniara functie = new FunctieLiniara(2, 1);

        SetValori setValori = new SetValori(
            Arrays.asList(new ValoareX(1),new ValoareX(2),new ValoareX(3))
        );

        evaluare = new EvaluareFunctie(functie, setValori);
    }

    @After
    public void clean() {
        System.out.println("@After: curatare dupa test");
        evaluare = null;
    }

    @Test
    public void testPrimulRezultat() {
        List<RezultatEvaluare> rezultate = evaluare.evalueaza();
        assertEquals(3, rezultate.get(0).getValoare(), 0.0001);
    }

    @Test
    public void testAlDoileaRezultat() {
        List<RezultatEvaluare> rezultate = evaluare.evalueaza();
        assertEquals(5, rezultate.get(1).getValoare(), 0.0001);
    }

    @Test
    public void testAlTreileaRezultat() {
        List<RezultatEvaluare> rezultate = evaluare.evalueaza();
        assertEquals(7, rezultate.get(2).getValoare(), 0.0001);
    }
}
