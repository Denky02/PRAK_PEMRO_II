package MODUL3.soal1;

import java.util.Random;

public class Dadu {

    private int nilai;

    public Dadu() {
        acakNilai();
    }

    private void acakNilai() {
        Random acak = new Random();
        nilai = acak.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}