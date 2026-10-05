package MODUL1;

import java.util.Scanner;

public class PRAK102_2510817210004_MuhammadRizkyRamadhani {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan input: ");
        int angka = sc.nextInt();

        int sisaBaris = 10;
        while (sisaBaris > 0) {
            if (angka % 5 == 0) {
                System.out.print(angka / 5 - 1);
            } else {
                System.out.print(angka);
            }

            if (sisaBaris > 1) {
                System.out.print(", ");
            }

            angka++;
            sisaBaris--;
        }
        System.out.println();
    }
}