/**
 * File		    : MMahasiswa.java
 * Tanggal      : 01/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File main Mahasiswa
 * */
package main;
import mahasiswa.Mahasiswa;
import walimahasiswa.WaliMahasiswa;

public class MMahasiswa {
    public static void main(String[] args){

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Demina Ayunda Chesara");
        mahasiswa.setNik("123456789");
        mahasiswa.setNim("24060122140149");
        mahasiswa.setJurusan("Informatika\n");

        WaliMahasiswa wali = new WaliMahasiswa();
        wali.setNama("Tony Stark");
        wali.setNik("000000000");
        wali.setNomorHp("0812345679");
        wali.setAlamat("Jalan Los Angles Chicago No. 999");

        mahasiswa.setWali(wali);
        mahasiswa.cetak();
    }
}
/**
 * KESIMPULAN
 * mahasiswa menggunakan konsep agregasi dengan walimahasiswa. Artinya, dalam kelas Mahasiswa, terdapat objek dari kelas WaliMahasiswa
 * yang digunakan untuk merepresentasikan hubungan antara seorang mahasiswa dengan wali mahasiswanya.
 *
 * mahasiswa dan walimahasiswa, adalah turunan dari kelas orang, dapat dilihat dari kode dengan adanya "extends".
 * Ini berarti kelas-kelas tersebut mewarisi sifat-sifat dari kelas orang.
 *
 * import digunakan untuk mengimpor kelas atau paket yang diperlukan ke dalam file program saat kompilasi.
 * jadi saat melakukan agregasi atau merupakan sebuah pewarisan dibutuhkan "import" agar dapat diakses
 */