package MODUL2.PRAK203_2510817210004_MuhammadRizkyRamadhani;

public class Soal3Main {
    public static void main(String[] args) {
        //Pada baris ini terjadi error karena class yang dipanggil Pegawai, bukan Employee
        //Employee p1 = new Employee();
        Pegawai p1 = new Pegawai();

        //Pada baris ini terjadi error karena kurang titik koma di akhir
        //p1.nama = "Roi"
        p1.nama = "Roi";

        //Pada baris ini terjadi error karena asal bertipe String, bukan char
        //p1.asal = 'Kingdom of Orvel';
        p1.asal = "Kingdom of Orvel";

        p1.setJabatan("Assasin");

        //Pada baris ini terjadi error karena umur belum diisi, jadi default 0
        //System.out.println("Umur: " + p1.umur);
        p1.umur = 17;

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}