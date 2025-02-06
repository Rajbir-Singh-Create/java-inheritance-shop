package shop;

import java.util.Random;

public class Smartphone extends Prodotto{
    private int IMEI;
    private double storageCapacity;

    public Smartphone(){
        calcolaIMEI();
    }

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

    public double setStorageCapacity(double storageCapacity){
        return this.storageCapacity = storageCapacity;
    }
}
