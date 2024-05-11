/*
 *	Nama File   : Main.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 11-05-2024
 *	Deskripsi   : main class generic
 */

public class Main {
    public static void main(String[] args) {
        // kamus
        Ulat k;
        Data<Kupu> anu;

        // algoritma
        k = new Ulat();
        anu = new Data<>();
        anu.setIsi(k);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}