package MODUL4.soal1;

import java.util.Scanner;

public class soal1main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nama Hewan Peliharaan: ");
        String nama = sc.nextLine();
        System.out.print("Ras: ");
        String ras = sc.nextLine();

        HewanPeliharaan hewan = new HewanPeliharaan(ras, nama);
        hewan.display();
    }
}