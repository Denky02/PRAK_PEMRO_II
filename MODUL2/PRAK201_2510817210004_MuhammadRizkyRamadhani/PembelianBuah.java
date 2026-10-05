package MODUL2.PRAK201_2510817210004_MuhammadRizkyRamadhani;

import java.util.Locale;

public class PembelianBuah {

    private String namaBuah;
    private double berat;
    private double harga;
    private double jumlahBeli;

    public PembelianBuah(String namaBuah, double berat, double harga, double jumlahBeli) {
        this.namaBuah = namaBuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public String getNamaBuah() {
        return namaBuah;
    }

    public void setNamaBuah(String namaBuah) {
        this.namaBuah = namaBuah;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getJumlahBeli() {
        return jumlahBeli;
    }

    public void setJumlahBeli(double jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungHargaSebelumDiskon() {
        return (jumlahBeli / berat) * harga;
    }

    public double hitungTotalDiskon() {
        double beratPerDiskon = 4;
        double persenDiskon = 2;

        double hargaPer4Kg = (beratPerDiskon / berat) * harga;
        double diskonPer4Kg = hargaPer4Kg * persenDiskon / 100;

        double totalDiskon = 0;
        for (int kg = 4; kg <= jumlahBeli; kg += 4) {
            totalDiskon = totalDiskon + diskonPer4Kg;
        }
        return totalDiskon;
    }

    public double hitungHargaSetelahDiskon() {
        return hitungHargaSebelumDiskon() - hitungTotalDiskon();
    }

    public void tampilkanRincianPembelian() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + jumlahBeli + "kg");
        System.out.printf(Locale.US, "Harga Sebelum Diskon: Rp%.2f%n", hitungHargaSebelumDiskon());
        System.out.printf(Locale.US, "Total Diskon: Rp%.2f%n", hitungTotalDiskon());
        System.out.printf(Locale.US, "Harga Setelah Diskon: Rp%.2f%n", hitungHargaSetelahDiskon());
        System.out.println();
    }
}