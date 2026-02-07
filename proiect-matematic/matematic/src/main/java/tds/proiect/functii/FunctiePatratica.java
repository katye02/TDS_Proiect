package tds.proiect.matematic.functii;

public class FunctiePatratica extends Functie {

    private double a;
    private double b;
    private double c;

    public FunctiePatratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculeaza(double x) {
        return a * x * x + b * x + c;
    }

    @Override
    public String toString() {
        return a + " * x^2 + " + b + " * x + " + c;
    }
}
