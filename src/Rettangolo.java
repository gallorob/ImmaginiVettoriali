public class Rettangolo extends Forma {

    private double base, altezza;

    public Rettangolo(Colore colore, double base, double altezza) {
        super(colore);
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getPerimetro() {
        return ((this.base + this.altezza)*2);
    }

    public double getArea() {
        return (this.base*this.altezza);
    }

    @Override
    public String toString() {
        return ("Rettangolo; Base: " + this.base + "; Altezza: " + this.altezza + "; Colore: " + this.getColore());
    }
}
