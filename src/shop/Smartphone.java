package shop;

import java.util.Random;

public class Smartphone extends Prodotto{
    private int IMEI;
    private double storageCapacity;

    public Smartphone(){
        calcolaIMEI();
    }

    // Metodo di utilità per generare il codice IMEI
    private void calcolaIMEI(){
        Random r = new Random();
        this.IMEI = r.nextInt(10000, 100000);
    }

    public int getIMEI(){
        return this.IMEI;
    }

    public double getStorageCapacity(){
        return this.storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity){
        if (storageCapacity >= 64){
            this.storageCapacity = storageCapacity;
        } else {
            System.out.println("Impossibile impostare la capacità sotto ai 64 GB");
        }
    }
}
