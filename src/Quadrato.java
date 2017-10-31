public class Quadrato extends Forma {

    private double lato;

    public Quadrato(Colore colore, double lato) {
        super(colore);
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public double perimetro() {
        return (this.lato*2);
    }

    public double area() {
        return (Math.pow(this.lato,2));
    }

    @Override
    public String toString() {
        return ("Quadrato; Lato: " + this.lato + " ; Colore: " + this.getColore());
    }
}
