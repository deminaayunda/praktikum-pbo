/*
 *	Nama File   : BangunDatar.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 20-03-2024
 *	Deskripsi   : abstract class bangun datar
 */
public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);
    public void setLuas(double l){
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}
