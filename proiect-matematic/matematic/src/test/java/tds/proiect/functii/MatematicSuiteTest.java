package tds.proiect.matematic;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tds.proiect.matematic.functii.TestFunctieLiniara;
import tds.proiect.matematic.functii.TestFunctiePatratica;
import tds.proiect.matematic.functii.ParamFunctieLiniaraTest;
import tds.proiect.matematic.functii.ParamFunctiePatraticaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestFunctieLiniara.class, TestFunctiePatratica.class, ParamFunctieLiniaraTest.class, ParamFunctiePatraticaTest.class})
public class MatematicSuiteTest {

}
