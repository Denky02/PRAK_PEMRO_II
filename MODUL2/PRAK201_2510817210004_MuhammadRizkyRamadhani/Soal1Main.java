package MODUL2.PRAK201_2510817210004_MuhammadRizkyRamadhani;

public class Soal1Main {

    public static void main(String[] args) {

        PembelianBuah apel = new PembelianBuah("Apel", 0.4, 7000, 40);
        PembelianBuah mangga = new PembelianBuah("Mangga", 0.2, 3500, 15);
        PembelianBuah alpukat = new PembelianBuah("Alpukat", 0.25, 10000, 12);

        apel.tampilkanRincianPembelian();
        mangga.tampilkanRincianPembelian();
        alpukat.tampilkanRincianPembelian();
    }
}