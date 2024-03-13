/*
 *	Nama File   : PersegiPanjang.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 13-03-2024
 *	Deskripsi   : class PersegiPanjang turunan dari poligon
 */

package org.bangundatar;
import org.poligon.Poligon;
public class PersegiPanjang extends Poligon {
    private double panjang, lebar;
    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }
    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi panjang bersisi "+this.getJumlahSisi());
    }
}
