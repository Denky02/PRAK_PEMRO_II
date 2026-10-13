package MODUL3.soal2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class soal2main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Negara> daftarNegara = new LinkedList<>();

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        HashMap<Integer, String> daftarBulan = new HashMap<>();
        for (int i = 0; i < 12; i++) {
            daftarBulan.put(i + 1, namaBulan[i]);
        }

        System.out.print("Masukkan jumlah negara: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Data negara ke-" + i);
            System.out.print("Masukkan nama negara: ");
            String nama = sc.nextLine();
            System.out.print("Masukkan jenis kepemimpinan (presiden/monarki/perdana menteri): ");
            String jenis = sc.nextLine();
            System.out.print("Masukkan nama pemimpin: ");
            String pemimpin = sc.nextLine();

            int tanggal = 0, bulan = 0, tahun = 0;
            if (!jenis.equalsIgnoreCase("monarki")) {
                System.out.print("Masukkan tanggal kemerdekaan: ");
                tanggal = sc.nextInt();
                System.out.print("Masukkan bulan kemerdekaan (1-12): ");
                bulan = sc.nextInt();
                System.out.print("Masukkan tahun kemerdekaan: ");
                tahun = sc.nextInt();
                sc.nextLine();
            }

            daftarNegara.add(new Negara(nama, jenis, pemimpin, tanggal, bulan, tahun));
        }

        System.out.println("\nDetail negara:\n");
        for (Negara n : daftarNegara) {
            n.tampilkanData(daftarBulan);
        }
    }
}