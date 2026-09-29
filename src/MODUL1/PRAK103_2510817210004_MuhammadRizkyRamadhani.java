package MODUL1;

import java.util.Scanner;

public class PRAK103_251081721004_MuhammadRizkyRamadhani {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = sc.nextInt();

        System.out.print("Masukkan bilangan awal: ");
        int angka = sc.nextInt();

        if (n < 1) {
            System.out.println("N harus lebih dari 0");
            return;
        }

        int tercetak = 0;
        do {
            if (angka % 2 != 0) {
                if (tercetak > 0) {
                    System.out.print(", ");
                }
                System.out.print(angka);
                tercetak++;
            }
            angka++;
        } while (tercetak < n);

        System.out.println();
    }
}