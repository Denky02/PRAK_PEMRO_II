package MODUL1;

import java.util.Scanner;

public class PRAK104_2510817210004_MuhammadRizkyRamadhani {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tanganAbu = new String[3];
        String[] tanganBagas = new String[3];

        System.out.print("Tangan Abu: ");
        for (int i = 0; i < 3; i++) {
            tanganAbu[i] = sc.next().toUpperCase();
        }

        System.out.print("Tangan Bagas: ");
        for (int i = 0; i < 3; i++) {
            tanganBagas[i] = sc.next().toUpperCase();
        }

        int skorAbu = 0;
        int skorBagas = 0;

        for (int ronde = 0; ronde < 3; ronde++) {
            String a = tanganAbu[ronde];
            String b = tanganBagas[ronde];

            if (!a.equals(b)) {
                if (a.equals("B") && b.equals("G")) {
                    skorAbu++;
                } else if (a.equals("G") && b.equals("K")) {
                    skorAbu++;
                } else if (a.equals("K") && b.equals("B")) {
                    skorAbu++;
                } else {
                    skorBagas++;
                }
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}