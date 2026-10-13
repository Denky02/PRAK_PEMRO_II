package MODUL3.soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class soal1main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList<Dadu> daftarDadu = new LinkedList<>();

        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = sc.nextInt();
        while (jumlahDadu < 1) {
            System.out.println("Jumlah dadu harus lebih dari 0");
            System.out.print("Masukkan jumlah dadu: ");
            jumlahDadu = sc.nextInt();
        }

        for (int i = 0; i < jumlahDadu; i++) {
            daftarDadu.add(new Dadu());
        }

        int total = 0;
        for (int i = 0; i < daftarDadu.size(); i++) {
            int nilaiDadu = daftarDadu.get(i).getNilai();
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + nilaiDadu);
            total += nilaiDadu;
        }

        System.out.println("Total nilai dadu keseluruhan " + total);
    }
}