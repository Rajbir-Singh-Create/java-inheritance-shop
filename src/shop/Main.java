package shop;

public class Main {
    public static void main(String[] args) throws Exception {
        Smartphone galaxyS25 = new Smartphone();
        // Set delle caratteristiche
        galaxyS25.setNome("Galaxy S25 Ultra");
        galaxyS25.setMarca("Samsung");
        galaxyS25.setPrezzo(1014.00);
        galaxyS25.setIva(1.22);
        galaxyS25.setStorageCapacity(512);

        // Stampo le caratteristiche
        System.out.println("Prodotto: " + galaxyS25.getMarca() + " " + galaxyS25.getNome());
        System.out.println("Codice prodotto: " + galaxyS25.getCodice());
        System.out.println("Codice IMEI: " + galaxyS25.getIMEI());
        System.out.println("capacità: " + galaxyS25.getStorageCapacity() + "GB");
        System.out.println("Prezzo base: " + galaxyS25.getPrezzo());
        System.out.println("Prezzo con iva: " + galaxyS25.getPriceWithIva());

        System.out.println(" ");
        
        Televisori lg_tv = new Televisori();
        // Set delle caratteristiche
        lg_tv.setNome("QLED 55");
        lg_tv.setMarca("LG");
        lg_tv.setPrezzo(2000.00);
        lg_tv.setIva(1.22);
        lg_tv.setDimensioni(55.5);
        lg_tv.setSmart(true);

        // Stampo le caratteristiche
        System.out.println("Prodotto: " + lg_tv.getMarca() + " " + lg_tv.getNome());
        System.out.println("Codice prodotto: " + lg_tv.getCodice());
        System.out.println("Dimensioni: " + lg_tv.getDimensioni() + " pollici");
        System.out.println("smart: " + lg_tv.isSmart());
        System.out.println("Prezzo base: " + lg_tv.getPrezzo());
        System.out.println("Prezzo con iva: " + lg_tv.getPriceWithIva());

        System.out.println(" ");

        Cuffie boseNC700 = new Cuffie();
        // Set delle caratteristiche
        boseNC700.setNome("NC700");
        boseNC700.setMarca("Bose");
        boseNC700.setPrezzo(250.00);
        boseNC700.setIva(1.22);
        boseNC700.setColore("Jet Black");
        boseNC700.setWireless(true);

        // Stampo le caratteristiche
        System.out.println("Prodotto: " + boseNC700.getMarca() + " " + boseNC700.getNome());
        System.out.println("Codice prodotto: " + boseNC700.getCodice());
        System.out.println("Colore: " + boseNC700.getColore());
        System.out.println("Funzionalità wireless: " + boseNC700.isWireless());
        System.out.println("Prezzo base: " + boseNC700.getPrezzo());
        System.out.println("Prezzo con iva: " + boseNC700.getPriceWithIva());
    }
}
