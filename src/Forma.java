public abstract class Forma {

    public Forma(Colore colore) {
        this.colore = colore;
    }

    private Colore colore;

    public Colore getColore() {
        return this.colore;
    }

    public abstract double perimetro();
    public abstract double area();

}