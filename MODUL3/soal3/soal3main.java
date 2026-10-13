package MODUL3.soal3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class soal3main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        HashMap<String, String> petaNim = new HashMap<>();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                String nim = sc.nextLine();

                if (petaNim.containsKey(nim)) {
                    System.out.println("NIM " + nim + " sudah digunakan, mahasiswa tidak ditambahkan.");
                } else {
                    daftarMahasiswa.add(new Mahasiswa(nama, nim));
                    petaNim.put(nim, nama);
                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                }

            } else if (pilihan == 2) {
                System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                String nim = sc.nextLine();

                if (petaNim.containsKey(nim)) {
                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        if (daftarMahasiswa.get(i).getNim().equals(nim)) {
                            daftarMahasiswa.remove(i);
                            break;
                        }
                    }
                    petaNim.remove(nim);
                    System.out.println("Mahasiswa dengan NIM " + nim + " dihapus.");
                } else {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }

            } else if (pilihan == 3) {
                System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                String nim = sc.nextLine();

                if (petaNim.containsKey(nim)) {
                    System.out.println("NIM: " + nim + ", Nama: " + petaNim.get(nim));
                } else {
                    System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
                }

            } else if (pilihan == 4) {
                if (daftarMahasiswa.isEmpty()) {
                    System.out.println("Daftar mahasiswa masih kosong.");
                } else {
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa m : daftarMahasiswa) {
                        System.out.println("NIM: " + m.getNim() + ", Nama: " + m.getNama());
                    }
                }

            } else if (pilihan == 0) {
                daftarMahasiswa.clear();
                petaNim.clear();
                System.out.println("Terima kasih!");

            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (pilihan != 0);
    }
}