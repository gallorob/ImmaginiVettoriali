public class TestImmagini {

    public static void main(String[] args) {
        ImgVect v1 = new ImgVect(4);

        v1.aggiungiForma(new Quadrato(Colore.RED, 5.));
        v1.aggiungiForma(new Cerchio(Colore.BLACK,3));
        v1.aggiungiForma(new Rettangolo(Colore.BLACK,3,4));

        v1.stampaForme();

        System.out.println(v1.getAreaTotale());
        System.out.println(v1.getPerimetroTotale());
        System.out.println(v1.getAreaColore(Colore.BLACK));
        System.out.println(v1.getPerimetroColore(Colore.BLACK));
        System.out.println(v1.getPerimetroColore(Colore.BLUE));
        System.out.println(v1.getAreaColore(Colore.YELLOW));

        v1.ordinaImmagini();
        v1.stampaForme();

    }

}