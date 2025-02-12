package shop;

import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto(){
        calcolaCodice();
    }

    // Metodo di utilità per generare il codice
    // Non accessibile dall'esterno della classe
    private void calcolaCodice(){
        Random r = new Random();
        this.codice = r.nextInt(100, 1000);
    }

    // getter per permettere di accedere al codice Prodotto solo in lettura
    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        if (nome != null){
            this.nome = nome;
        } else {
            System.out.println("Inserisci un nome valido");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null){
            this.marca = marca;
        } else {
            System.out.println("Inserisci una marca valida");
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo > 0){
            this.prezzo = prezzo;
        } else {
            System.out.println("Impossibile impostare un prezzo minore o uguale a 0");
        }
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        if (iva == 1.04 || iva == 1.1 || iva == 1.22){
            this.iva = iva;    
        } else {
            System.out.println("Impossibile impostare un iva non convenzionale.");
        }
    }

    public double getPriceWithIva(){
        return this.prezzo * this.iva;
    }

    @Override
    public String toString(){
        return "Codice prodotto: " + getCodice()
        + ", Prodotto: " + getMarca() + " " + getNome()
        + ", prezzo: " + getPrezzo()
        + ", iva: " + getIva()
        + ", prezzo intero: " + getPriceWithIva();
    }
}
