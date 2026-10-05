package MODUL1;

import java.util.Locale;
import java.util.Scanner;

public class PRAK105_2510817210004_MuhammadRizkyRamadhani {

    static final double PHI = 3.14;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Masukkan jari-jari: ");
        double jariJari = sc.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double tinggi = sc.nextDouble();

        double volume = PHI * jariJari * jariJari * tinggi;

        String hasil = String.format("%.3f", volume).replace(",", ".");

        System.out.println("Volume tabung dengan jari-jari " + jariJari + " cm dan tinggi "
                + tinggi + " cm adalah " + hasil + " m3");
    }
}