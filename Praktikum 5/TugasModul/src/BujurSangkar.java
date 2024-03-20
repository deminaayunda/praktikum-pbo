/*
 *	Nama File   : BujurSangkar.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 20-03-2024
 *	Deskripsi   : class BujurSangkar implementasi abstract dari BangunDatar
 */
public class BujurSangkar extends BangunDatar { // extends manggil abstract
    @Override
    public double hitungLuas(double sisi) {
        luas = sisi * sisi;
        return luas;
    }
}
