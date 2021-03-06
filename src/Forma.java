public abstract class Forma implements Misurabile, Comparable<Forma> {

    public Forma(Colore colore) {
        this.colore = colore;
    }

    private Colore colore;

    public Colore getColore() {
        return this.colore;
    }

    public abstract double getPerimetro();
    public abstract double getArea();

    public int compareTo(Forma f) {
        //Double.compare(this.getArea(), f.getArea());

        if (this.getArea() > f.getArea()){
            return 1;
        }
        else if (this.getArea() < f.getArea()){
            return -1;
        }
        return 0;
    }

}
