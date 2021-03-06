public class Tester {

    public static void main(String[] args) {
        ImgVect v1 = new ImgVect(4);

        Forma f1 = new Cerchio(Colore.BLACK,3.);
        Forma f2 = new Quadrato(Colore.RED,10.);
        Forma f3 = new Rettangolo(Colore.BLACK,3,4);
        v1.aggiungiForma(f1);
        //System.out.println(v1.getContatoreImmagini());
        v1.aggiungiForma(f2);
        //System.out.println(v1.getContatoreImmagini());
        v1.aggiungiForma(f3);

        v1.stampaForme();

        System.out.println(v1.getAreaTotale());
        System.out.println(v1.getPerimetroTotale());
        System.out.println(v1.getAreaColore(Colore.BLACK));
        System.out.println(v1.getPerimetroColore(Colore.BLACK));

        v1.ordinaImmagini();
        v1.stampaForme();

    }

}