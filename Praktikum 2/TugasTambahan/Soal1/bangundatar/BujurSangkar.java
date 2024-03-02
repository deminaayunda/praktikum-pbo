/**
 * File		    : BujurSangkar.java
 * Tanggal      : 01/03/24
 * Penulis      : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas BujurSangkar
 * */
package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon // pewarisan
{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi() 
    {
        return this.panjangSisi;
    }
}
