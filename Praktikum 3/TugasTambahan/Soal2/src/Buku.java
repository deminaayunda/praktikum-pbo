/**
 * File		    : Buku.java
 * Tanggal      : 09/03/2024
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: file kelas Buku
 * */
public class Buku {
    private String judul;
    private boolean tersedia;

    public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

}
