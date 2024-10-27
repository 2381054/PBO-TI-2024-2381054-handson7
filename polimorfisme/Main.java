package polimorfisme;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(5);
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("Keliling Persegi: " + bangunDatar.keliling());

        bangunDatar = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + bangunDatar.luas());
        System.out.println("Keliling Lingkaran: " + bangunDatar.keliling());

        bangunDatar =  new Segitiga(5, 9);
        System.out.println("Luas Segitiga: " + bangunDatar.luas());
        System.out.println("Keliling Segitiga: " + bangunDatar.keliling());

    }
}
