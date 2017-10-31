public abstract class Forma implements Comparable{

    public Forma(Colore colore) {
        this.colore = colore;
    }

    private Colore colore;

    public Colore getColore() {
        return this.colore;
    }

    public abstract double perimetro();
    public abstract double area();

    public int compareTo(Object f) {
        if (this.area() >= ((Forma)f).area()){
            return 1;
        }
        else if (this.area() <= ((Forma)f).area()){
            return -1;
        }
        else return 0;
    }

}