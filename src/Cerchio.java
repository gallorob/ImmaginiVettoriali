public class Cerchio extends Forma {

    private double raggio;

    public Cerchio(Colore colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public double perimetro() {
        return (this.raggio*2*Math.PI);
    }

    public double area() {
        return (Math.PI*Math.pow(this.raggio,2));
    }

    @Override
    public String toString() {
        return ("Cerchio; Raggio: " + this.raggio + "; Colore: " + this.getColore());
    }
}
