package membuatobjekpertama;

public class Mobil {
    String warna; //pake private biar gabisah diubah//
    String merek;
    int kecepatanMax;

    public Mobil (String warna, String merek, int kecepatanMax) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMax = kecepatanMax;

}

public void tampilkanInfo() {
    System.out.println("Mobil Merek: " + merek);
    System.out.println("Warna: " + warna);
    System.out.println("Kecepatan Max: " + kecepatanMax);
    }

    public void berjalan() {
        System.out.println("Mobil " + merek + " sedang berjalan");
    }

    public void berhenti() {
        System.out.println("Mobil " + merek + " sedang berhenti" );
    }

}
