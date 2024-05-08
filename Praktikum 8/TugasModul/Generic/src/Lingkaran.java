/*
 *	Nama File   : Lingkaran.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 08-05-2024
 *	Deskripsi   : class lingkaran inherits bangundatar
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){

        this.jejari = jejari;
    }
    public double hitungKeliling(){

        return 2*jejari*3.14;
    }
}
