package MODUL2.PRAK203_2510817210004_MuhammadRizkyRamadhani;

//Pada baris ini terjadi error karena nama class di main adalah Pegawai, bukan Employee
//public class Employee {
public class Pegawai {
    public String nama;

    //Pada baris ini terjadi error karena asal ditulis char, padahal asal berupa teks panjang
    //public char asal;
    public String asal;

    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    //Pada baris ini terjadi error karena tipe kembalian String tapi atribut asal bertipe char
    //public String getAsal() {
    //    return asal;
    //}
    public String getAsal() {
        return asal;
    }

    //Pada baris ini terjadi error karena method setJabatan tidak punya parameter
    //public void setJabatan() {
    //    this.jabatan = j;
    //}
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}