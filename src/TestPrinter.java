public class TestPrinter {

    public static void main(String[] args) {
        ImgVect v1 = new ImgVect(4);
        InkJetPrinter prnt = new InkJetPrinter(50);

        v1.aggiungiForma(new Quadrato(Colore.RED, 5.));
        v1.aggiungiForma(new Cerchio(Colore.BLACK,3));
        v1.aggiungiForma(new Rettangolo(Colore.BLACK,3,4));

        System.out.println(v1);

        prnt.initCartridges();
        prnt.showCartridgesLevel();

        prnt.checkCartridgesLevel(v1);

        prnt.stampa(v1);
        
        prnt.showCartridgesLevel();

        prnt.stampa(v1);
    }

}
