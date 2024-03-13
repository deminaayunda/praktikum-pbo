/*
 *	Nama File   : Segitiga.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 13-03-2024
 *	Deskripsi   : Class segitiga turunan dari class poligon
 */

package org.bangundatar;
import org.poligon.Poligon;

public class Segitiga extends Poligon //pewarisan
{
    private double alas, tinggi;

    public Segitiga (double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi; // dari poligon
    }

    public double hitungLuas(){

        return (alas * tinggi) / 2;
    }
    public void printInfo(){
        System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
    }
}


