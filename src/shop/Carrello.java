package shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) throws Exception {
        // Inizializzo un array di tre elementi
        Prodotto carrelloProdotti[];

        // Chiedo all'utente quanti prodotti vuole inserire nel carrello
        Scanner productNum = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi inserire nel carrello?");
        int numProdotti = productNum.nextInt();
        carrelloProdotti = new Prodotto[numProdotti];

        // Apro il flusso per l'input dall'utente
        Scanner scanProduct = new Scanner(System.in);
        
        // Itero per la lunghezza dell'array per inserire il prodotto
        for(int i = 0; i < carrelloProdotti.length; i++){
            System.out.println("Inserisci il prodotto:");
            String nomeProdotto = scanProduct.nextLine();
            
            // Controllo quale tipo di prodotto è stato inserito
            // e uso il costruttore opportuno in base all'input
            if (nomeProdotto.equals("Smartphone")){
                Smartphone smartphone1 = new Smartphone();
                carrelloProdotti[i] = smartphone1;
                
                // Se volessi chiedere all'utente di inserire tutte le caratteristiche a mano:
                // Scanner marcaIn = new Scanner(System.in);
                // System.out.println("Seleziona la marca:");
                // String marca = marcaIn.nextLine();
                // smartphone1.setMarca(marca);

                // Set delle caratteristiche
                smartphone1.setNome("Galaxy S25 Ultra");
                smartphone1.setMarca("Samsung");
                smartphone1.setPrezzo(1014.00);
                smartphone1.setIva(1.22);
                smartphone1.setStorageCapacity(512);
            } else if (nomeProdotto.equals("Televisore")){
                Televisori televisore1 = new Televisori();
                carrelloProdotti[i] = televisore1;
                
                // Set delle caratteristiche
                televisore1.setNome("QLED 55");
                televisore1.setMarca("LG");
                televisore1.setPrezzo(2000.00);
                televisore1.setIva(1.22);
                televisore1.setDimensioni(55.5);
                televisore1.setSmart(true);
            } else if (nomeProdotto.equals("Cuffie")){
                Cuffie cuffie1 = new Cuffie();
                carrelloProdotti[i] = cuffie1;
                
                // Set delle caratteristiche
                cuffie1.setNome("NC700");
                cuffie1.setMarca("Bose");
                cuffie1.setPrezzo(250.00);
                cuffie1.setIva(1.22);
                cuffie1.setColore("Jet Black");
                cuffie1.setWireless(true);
                cuffie1.setCablate(true);
            }
        }

        System.out.println(" ");
        // Stampo il carrello
        for(int j = 0; j < carrelloProdotti.length; j++){
            if(carrelloProdotti[j] == null){
                System.out.println("Non ci sono altri prodotti disponibili.");
            }
            System.out.println(carrelloProdotti[j]);
        }
        
        
        // Smartphone galaxyS25 = new Smartphone();
        // // Set delle caratteristiche
        // galaxyS25.setNome("Galaxy S25 Ultra");
        // galaxyS25.setMarca("Samsung");
        // galaxyS25.setPrezzo(1014.00);
        // galaxyS25.setIva(1.22);
        // galaxyS25.setStorageCapacity(512);

        // // Stampo le caratteristiche
        // System.out.println("Prodotto: " + galaxyS25.getMarca() + " " + galaxyS25.getNome());
        // System.out.println("Codice prodotto: " + galaxyS25.getCodice());
        // System.out.println("Codice IMEI: " + galaxyS25.getIMEI());
        // System.out.println("capacità: " + galaxyS25.getStorageCapacity() + "GB");
        // System.out.println("Prezzo base: " + galaxyS25.getPrezzo());
        // System.out.println("Prezzo con iva: " + galaxyS25.getPriceWithIva());

        // System.out.println(" ");
        
        // Televisori lg_tv = new Televisori();
        // // Set delle caratteristiche
        // lg_tv.setNome("QLED 55");
        // lg_tv.setMarca("LG");
        // lg_tv.setPrezzo(2000.00);
        // lg_tv.setIva(1.22);
        // lg_tv.setDimensioni(55.5);
        // lg_tv.setSmart(true);

        // // Stampo le caratteristiche
        // System.out.println("Prodotto: " + lg_tv.getMarca() + " " + lg_tv.getNome());
        // System.out.println("Codice prodotto: " + lg_tv.getCodice());
        // System.out.println("Dimensioni: " + lg_tv.getDimensioni() + " pollici");
        // System.out.println("smart: " + lg_tv.isSmart());
        // System.out.println("Prezzo base: " + lg_tv.getPrezzo());
        // System.out.println("Prezzo con iva: " + lg_tv.getPriceWithIva());

        // System.out.println(" ");

        // Cuffie boseNC700 = new Cuffie();
        // // Set delle caratteristiche
        // boseNC700.setNome("NC700");
        // boseNC700.setMarca("Bose");
        // boseNC700.setPrezzo(250.00);
        // boseNC700.setIva(1.22);
        // boseNC700.setColore("Jet Black");
        // boseNC700.setWireless(true);
        // boseNC700.setCablate(true);
        
        // // Stampo le caratteristiche
        // System.out.println("Prodotto: " + boseNC700.getMarca() + " " + boseNC700.getNome());
        // System.out.println("Codice prodotto: " + boseNC700.getCodice());
        // System.out.println("Colore: " + boseNC700.getColore());
        // System.out.println("Funzionalità wireless: " + boseNC700.isWireless());
        // System.out.println("Possibilità di utilizzo tramite cavo: " + boseNC700.isCablate());
        // System.out.println("Prezzo base: " + boseNC700.getPrezzo());
        // System.out.println("Prezzo con iva: " + boseNC700.getPriceWithIva());
    }
}
