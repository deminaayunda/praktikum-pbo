/**
 * File		    : Main.java
 * Tanggal      : 09/03/2024
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: file main
 * */

public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota = new Anggota("Meredith Grey");
        Buku buku1 = new Buku("SOBOTA");
        Buku buku2  = new Buku("Kiat Belajar Masuk FK UI");
        Buku buku3 = new Buku("McDreamy's Life");
        Buku buku4 = new Buku("Penelitian Alzheimer");

        buku1.setTersedia(true);
        buku2.setTersedia(true);
        buku3.setTersedia(true);
        buku4.setTersedia(true);


        // TODO 4: Buat implementasi try-catch untuk handling exception pada saat melakukan peminjaman buku
        // Buat dua block catch: ketika anggota sudah meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam
        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);


        }
        catch (MaksimumBukuTerpinjamException e){
            System.out.println("Gagal melakukan peminjaman buku karena sudah batas maksimum: "+ e.getMessage());
        }
        catch (BukuTidakTersediaException e){
            System.out.println("Gagal melakukan peminjaman buku karena tidak tersedia: " + e.getMessage());
        }
    }

}
