/**
 * File		    : MGaris.java
 * Tanggal      : 28/02/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas Main Garis
 * */
public class MGaris {
    public static void main(String[] args){
        Titik titikAwal = new Titik (0, 0);
        Titik titikAkhir = new Titik(3, 4);

        Garis garis = new Garis(titikAwal, titikAkhir);
        System.out.println("Koordinat Titik Awal: (" + garis.getTitikAwal().getAbsis() + ", " + garis.getTitikAwal().getOrdinat() + ")");
        System.out.println("Koordinat Titik Akhir: (" + garis.getTitikAkhir().getAbsis() + ", " + garis.getTitikAkhir().getOrdinat() + ")");

        Titik titikBaru = new Titik(5, 6);
        garis.setTitikAkhir(titikBaru);

        System.out.println("Koordinat Titik Akhir setelah diubah: (" + garis.getTitikAkhir().getAbsis() + ", " + garis.getTitikAkhir().getOrdinat() + ")");
    }
}

// * kesimpulan
// * ketika method refleksi dibuat private, dia tidak bisa
// * dipanggil di class main, maka dari itu perlu dibuat public.
// * Jadi, method di kelas titik yang akan dipanggil di class main perlu di buat public, agar bisa dipanggil.
// garis merupakan hubungan agregasi sama titik, yang mana titik merupakan bagian dari garis
// */

