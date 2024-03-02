/**
 * File		    : Mahasiswa.java
 * Tanggal      : 01/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas Mahasiswa
 * */

package mahasiswa;

import orang.Orang;
import walimahasiswa.WaliMahasiswa;
public class Mahasiswa extends Orang{ // pewarisan dari orang
    private String nim, jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(){
        super("", ""); // default constructor dari orang
        this.nim = "";
        this.jurusan = "";
        this.wali = new WaliMahasiswa();
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
    public WaliMahasiswa getWali(){ // agregasi dengan wali
        return wali;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }
    public void cetak() {
        System.out.println("Data Mahasiswa");
        System.out.println("Nama Mahasiswa: " + getNama());
        System.out.println("NIK Mahasiswa: " + getNik());
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jurusan Mahasiswa: " + jurusan);
        System.out.println("Data Wali Mahasiswa");
        System.out.println("Nama Wali: " + wali.getNama());
        System.out.println("NIK Wali: " + wali.getNik());
        System.out.println("Nomor HP Wali: " + wali.getNomorHp());
        System.out.println("Alamat Wali: " + wali.getAlamat());
    }
}
