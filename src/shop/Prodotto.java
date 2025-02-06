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
        return this.codice;
    }

    public String getNome(){
        return this.nome;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPriceWithIva(){
        return this.prezzo * this.iva;
    }
}
