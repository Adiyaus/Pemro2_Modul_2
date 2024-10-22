public class Buah {
    private String namaBuah;
    private double berat;
    private double harga;
    private double jumlahBeli;
    private double sebelumDiskon;
    private double totalDiskon;
    private double setelahDiskon;

    public Buah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
        this.sebelumDiskon = jumlahBeli / berat * harga;
        double kelipatan = this.jumlahBeli >= 4 ? this.jumlahBeli / 4 : 0.0;
        this.totalDiskon = 0.02 * (4 * this.harga) * Math.floor(kelipatan);
        this.setelahDiskon = this.sebelumDiskon - this.totalDiskon;
    }

    public void display() {
        System.out.println("Nama Buah : " + this.namaBuah);
        System.out.println("Berat : " + this.berat);
        System.out.println("Harga : " + this.harga);
        System.out.println("Jumlah Beli : " + this.jumlahBeli);
        System.out.println("Harga Sebelum Diskon : " + this.sebelumDiskon);
        System.out.println("Total Diskon : " + this.totalDiskon);
        System.out.println("Harga Setelah Diskon : " + this.setelahDiskon);
    }

    public static void main(String[] args) {
        Buah apel = new Buah("Apel", 0.4, 7000.0, 40.0);
        Buah mangga = new Buah("Mangga", 0.2, 3500.0, 15.0);
        Buah alpukat = new Buah("Alpukat", 0.25, 10000.0, 12.0);
        apel.display();
        mangga.display();
        alpukat.display();
    }
}
