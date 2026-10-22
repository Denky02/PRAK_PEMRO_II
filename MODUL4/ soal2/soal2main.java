package MODUL4.soal2;

import java.util.Scanner;

public class soal2main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        sc.nextLine();

        if (pilihan == 1 || pilihan == 2) {
            System.out.print("Nama hewan peliharaan: ");
            String nama = sc.nextLine();
            System.out.print("Ras: ");
            String ras = sc.nextLine();
            System.out.print("Warna Bulu: ");
            String warna = sc.nextLine();

            if (pilihan == 1) {
                Kucing kucing = new Kucing(ras, nama, warna);
                kucing.displayDetailKucing();
            } else {
                System.out.print("Kemampuan (pisahkan dengan koma): ");
                String[] kemampuan = sc.nextLine().split(",");
                for (int i = 0; i < kemampuan.length; i++) {
                    kemampuan[i] = kemampuan[i].trim();
                }

                Anjing anjing = new Anjing(nama, ras, warna, kemampuan);
                anjing.displayDetailAnjing();
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}