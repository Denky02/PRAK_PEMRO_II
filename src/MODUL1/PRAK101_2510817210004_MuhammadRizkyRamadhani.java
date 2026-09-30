package MODUL1;

import java.util.Locale;
import java.util.Scanner;

public class PRAK101_2510817210004_MuhammadRizkyRamadhani {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = sc.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = sc.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggal = sc.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulan = sc.nextInt();
        if (bulan < 1 || bulan > 12) {
            System.out.println("Bulan tidak valid (harus 1 - 12)");
            return;
        }

        System.out.print("Masukkan Tahun Lahir: ");
        int tahun = sc.nextInt();
        if (tahun < 1) {
            System.out.println("Tahun tidak valid");
            return;
        }

        boolean kabisat = (tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0);

        int hariMaks;
        switch (bulan) {
            case 2:
                hariMaks = kabisat ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                hariMaks = 30;
                break;
            default:
                hariMaks = 31;
        }

        if (tanggal < 1 || tanggal > hariMaks) {
            System.out.println("Tanggal tidak valid (bulan ini maksimal " + hariMaks + " hari)");
            return;
        }

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggi = sc.nextInt();
        if (tinggi <= 0) {
            System.out.println("Tinggi badan harus lebih dari 0");
            return;
        }

        System.out.print("Masukkan Berat Badan: ");
        double berat = sc.nextDouble();
        if (berat <= 0) {
            System.out.println("Berat badan harus lebih dari 0");
            return;
        }

        System.out.println();
        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir
                + " pada Tanggal " + tanggal + " " + namaBulan[bulan - 1] + " " + tahun);
        System.out.println("Tinggi Badan " + tinggi + " cm dan Berat Badan " + berat + " kilogram");
    }
}
