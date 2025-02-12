package shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) throws Exception {
        // Inizializzo un array di elementi di tipo Prodotto
        Prodotto carrelloProdotti[];

        // Chiedo all'utente quanti prodotti vuole inserire nel carrello
        Scanner productNum = new Scanner(System.in);
        System.out.println("Quanti prodotti vuoi valorizzare?");
        int numProdotti = productNum.nextInt();
        carrelloProdotti = new Prodotto[numProdotti];
        
        // Non sappiamo quale scelta farà l'utente
        // ma sappiamo che si tratta di un prodotto
        // quindi inizializziamo il prodotto a null
        Prodotto prodotto = null;

        // Itero per la lunghezza dell'array per inserire il prodotto
        for(int i = 0; i < carrelloProdotti.length; i++){
            // Apro il flusso per l'input dall'utente
            Scanner scanProduct = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Decidere quale prodotto si vuole valorizzare:");
            String nomeProdotto = scanProduct.nextLine();
            
            // Controllo quale tipo di prodotto è stato inserito
            // e uso il costruttore opportuno in base all'input
            if (nomeProdotto.equals("Smartphone")){
                // Prendo i valori
                System.out.println("Quanti GB ha lo smartphone?");
                double storageCapacity = scanProduct.nextDouble();
                
                // e li uso per inizializzare l'oggetto
                prodotto = new Smartphone(storageCapacity);
                
                // Prendo il resto delle caratteristiche del prodotto
                buildProdotto(prodotto);

                // inserisco il prodotto nell'array
                carrelloProdotti[i] = prodotto;
            } else if (nomeProdotto.equals("Televisore")){
                // Prendo i valori
                System.out.println("Quanti pollici ha la TV?");
                double pollici = scanProduct.nextDouble();
                System.out.println("E' smart?");
                System.out.println("(1 se sì, 2 se no)");
                int sceltaSmart = scanProduct.nextInt();
                boolean smart = false;
                if (sceltaSmart== 1){
                    smart = true;
                }

                // e li uso per inizializzare l'oggetto
                prodotto = new Televisore(pollici, smart);
                
                // Prendo il resto delle caratteristiche del prodotto
                buildProdotto(prodotto);

                // inserisco il prodotto nell'array
                carrelloProdotti[i] = prodotto;
            } else if (nomeProdotto.equals("Cuffie")){
                // Prendo i valori
                System.out.println("Inserisci il colore delle cuffie:");
                String colore = scanProduct.nextLine();
                System.out.println("Le cuffie sono wireless? (y/n)");
                String sceltaWireless = scanProduct.nextLine();
                boolean wireless = false;
                if(sceltaWireless.equalsIgnoreCase("y")){
                    wireless = true;
                }

                // e li uso per inizializzare l'oggetto
                prodotto = new Cuffie(colore, wireless);
                
                // Prendo il resto delle caratteristiche del prodotto
                buildProdotto(prodotto);

                // inserisco il prodotto nell'array
                carrelloProdotti[i] = prodotto;
            } else {
                System.out.println("Non ci sono altri prodotti disponibili.");
            }
        }

        System.out.println(" ");
        // Stampo il carrello
        for(int j = 0; j < carrelloProdotti.length; j++){
            System.out.println(carrelloProdotti[j]);
        }

        // System.out.println(prodotto);
    }

    private static void buildProdotto(Prodotto prodotto){
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il nome del prodotto:");
        String nome = scan.nextLine();
        prodotto.setNome(nome);

        System.out.println("Inserisci la marca:");
        String marca = scan.nextLine();
        prodotto.setMarca(marca);

        System.out.println("Inserisci il prezzo:");
        double prezzo = scan.nextDouble();
        prodotto.setPrezzo(prezzo);

        System.out.println("Inserisci l'iva:");
        double iva = scan.nextDouble();
        prodotto.setIva(iva);
    }
}
