package shop;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

    public Cuffie(String colore, boolean wireless) {
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        String wireless = isWireless() ? "sì" : "no";
        return super.toString() + ", colore: " + getColore() + ", Funzionalità wireless: " + wireless;
    }
}
