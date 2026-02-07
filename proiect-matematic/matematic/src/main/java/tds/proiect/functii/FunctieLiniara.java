package tds.proiect.matematic.functii;

public class FunctieLiniara extends Functie {

    private double a;
    private double b;

    public FunctieLiniara(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculeaza(double x) {
        return a * x + b;
    }

    @Override
    public String toString() {
        return a + " * x + " + b;
    }
}
