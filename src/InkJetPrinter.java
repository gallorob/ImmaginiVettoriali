public class InkJetPrinter {

    private final int MAXLEVEL;
    private int[] cartridge = new int[Colore.values().length];

    public InkJetPrinter(int MAXLEVEL) {
        this.MAXLEVEL = MAXLEVEL;
    }

    public void initCartridges() {
        for (Colore col:Colore.values()) {
            cartridge[col.ordinal()] = this.MAXLEVEL;
        }
    }

    public void changeCartridge(Colore col) {
        cartridge[col.ordinal()] = this.MAXLEVEL;
    }

    public boolean checkCartridgesLevel(ImgVect img) {
        for(Colore col:Colore.values()) {
                if (cartridge[col.ordinal()] < img.getAreaColore(col)) return false;
        }
        return true;
    }

    public void stampa(ImgVect img){
        if(checkCartridgesLevel(img)) {
            for (Colore col:Colore.values()) {
                cartridge[col.ordinal()] -= img.getAreaColore(col);
            }
        }
    }

    public void showCartridgesLevel() {
        for (Colore col:Colore.values()) {
            System.out.println(col + ": " + cartridge[col.ordinal()]);
        }
    }
}
