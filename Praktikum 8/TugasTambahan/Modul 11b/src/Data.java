/*
 *	Nama File   : Data.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 11-05-2024
 *	Deskripsi   : generic class Data
 */

public class Data<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}
