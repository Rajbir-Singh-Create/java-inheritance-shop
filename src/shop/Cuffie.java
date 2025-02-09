package shop;

public class Cuffie extends Prodotto{
    private String colore;
    private boolean cablate;
    private boolean wireless;

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isCablate() {
        return cablate;
    }

    public void setCablate(boolean cablate) {
        this.cablate = cablate;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return super.toString() + ", colore: " + getColore() + ", Funzionalità wireless: " + isWireless()
            + ", Possibilità di utilizzo tramite cavo: " + isCablate();
    }
}
