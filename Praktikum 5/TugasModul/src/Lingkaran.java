/*
 *	Nama File   : Lingkaran.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 20-03-2024
 *	Deskripsi   : class Lingkaran menggunakkan interface
 */

import static java.lang.Math.PI;
class Lingkaran implements IArea{ // buat manggil interface
    private double jejari;

    public Lingkaran(double r){

        jejari = r;
    }

    @Override
    public double hitungLuas() {

        return PI*jejari*jejari;
    }
}
