/**
 * File		    : orang.java
 * Tanggal      : 01/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas orang
 * */

package orang;

public class Orang {
    protected String nama;
    protected String nik;

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}
