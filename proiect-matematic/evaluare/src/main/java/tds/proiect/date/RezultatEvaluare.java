package tds.proiect.evaluare.date;

public class RezultatEvaluare {

    private double x;
    private double valoare;

    public RezultatEvaluare(double x, double valoare) {
        this.x = x;
        this.valoare = valoare;
    }

    public double getX() {
        return x;
    }

    public double getValoare() {
        return valoare;
    }
}
