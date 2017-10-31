import java.util.Arrays;

public class ImgVect {

    private final int MAX_IMG;
    private int contatoreImmagini;
    private Forma[] vetForme;

    private double AreaTotale;
    private double PerimetroTotale;
    private double AreaColore;
    public double PerimetroColore;

    public ImgVect(int MAX_IMG) {
        this.MAX_IMG = MAX_IMG;
        this.contatoreImmagini = 0;
        this.vetForme = new Forma[MAX_IMG];
    }

    public int getContatoreImmagini() {
        return contatoreImmagini;
    }

    public void aggiungiForma(Forma nuovaForma) {
        if(this.contatoreImmagini < this.MAX_IMG) {
            this.vetForme[this.contatoreImmagini] = nuovaForma;
            this.contatoreImmagini++;
        }
        else {
            System.out.println("Raggiunto il numero massimo di forme.");
        }
    }

    public double getAreaTotale() {
        for(int i = 0; i < contatoreImmagini; i++) {
            this.AreaTotale += this.vetForme[i].area();
        }
        return this.AreaTotale;
    }

    public double getPerimetroTotale() {
        for(int i = 0; i < contatoreImmagini; i++) {
            this.PerimetroTotale += this.vetForme[i].perimetro();
        }
        return this.PerimetroTotale;
    }

    public double getAreaColore(Colore colore) {
        for(int i = 0; i < contatoreImmagini; i++) {
            if(this.vetForme[i].getColore() == colore) {
                AreaColore += this.vetForme[i].area();
            }
        }
        return AreaColore;
    }

    public double getPerimetroColore(Colore colore) {
        for(int i = 0; i < contatoreImmagini; i++) {
            if(this.vetForme[i].getColore() == colore) {
                PerimetroColore += this.vetForme[i].perimetro();
            }
        }
        return PerimetroColore;
    }

    public void stampaForme() {
        for(int i = 0; i < contatoreImmagini; i++) {
            System.out.println(vetForme[i]);
        }
    }

    public void ordinaImmagini() {
        Arrays.sort(vetForme);
    }

}
