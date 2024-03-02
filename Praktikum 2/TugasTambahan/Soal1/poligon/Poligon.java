/**
 * File		    : Poligon.java
 * Tanggal      : 01/03/24
 * Penulis      : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas poligon
 * */

package org.poligon;

public class Poligon 
{
    protected int jumlahSisi;

    public Poligon()
    {
        this.jumlahSisi = 1;
    }

    public void setJumlahSisi(int jumlahSisi)
    {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi()
    {
        return this.jumlahSisi;
    }
}
