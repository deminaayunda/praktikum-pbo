/**
 * File		    : Garis.java
 * Tanggal      : 28/02/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas Garis
 * */
public class Garis {
    private Titik titikAwal, titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }
    public Titik getTitikAwal()
    {
        return titikAwal;
    }

    public Titik getTitikAkhir()
    {
        return titikAkhir;
    }
    public void setTitikAkhir(Titik titik)
    {
        this.titikAkhir = titik;
    }
    public void setTitikAwal(Titik titik)
    {
        this.titikAwal = titik;
    }

}
