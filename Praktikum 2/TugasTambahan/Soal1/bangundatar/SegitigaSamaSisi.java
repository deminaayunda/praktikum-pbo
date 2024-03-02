/**
 * File		    : SegitigaSamaSisi.java
 * Tanggal      : 01/03/24
 * Penulis      : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas SegitigaSamaSisi
 * */

package org.bangundatar;
import org.poligon.Poligon;

public class SegitigaSamaSisi extends Poligon //pewarisan
{
    private double sisi;

    public SegitigaSamaSisi(double sisi){
        this.jumlahSisi = 3; // dari poligon
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }
    public double getLuas(){
        return (Math.sqrt(3) / 4) * sisi * sisi;
    }
    public double getTinggiSegitiga(){
        return (Math.sqrt(3) / 2) * sisi;
    }
}

