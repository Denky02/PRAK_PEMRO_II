package MODUL3.soal2;

import java.util.HashMap;

public class Negara {

    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;

    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin,
                  int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    public void tampilkanData(HashMap<Integer, String> daftarBulan) {
        String gelar;
        if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            gelar = "Raja";
        } else if (jenisKepemimpinan.equalsIgnoreCase("presiden")) {
            gelar = "Presiden";
        } else {
            gelar = "Perdana Menteri";
        }

        System.out.println("Negara " + nama + " mempunyai " + gelar + " bernama " + namaPemimpin);
        if (!jenisKepemimpinan.equalsIgnoreCase("monarki")) {
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " "
                    + daftarBulan.get(bulanKemerdekaan) + " " + tahunKemerdekaan);
        }
        System.out.println();
    }
}