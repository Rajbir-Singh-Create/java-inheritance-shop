package shop;

public class Televisore extends Prodotto{
    private double dimensioni;
    private boolean smart;

    public Televisore(double dimensioni, boolean smart) {
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    public double getDimensioni() {
        return dimensioni;
    }

    public void setDimensioni(double dimensioni) {
        if (dimensioni > 24){
            this.dimensioni = dimensioni;
        } else {
            System.out.println("Impossibile impostare una dimensione inferiore ai 24 pollici");
        }
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        String smart = isSmart() ? "sì" : "no";
        return super.toString() + ", dimensioni: " + getDimensioni() + ", smart TV: " + smart;
    }
}
