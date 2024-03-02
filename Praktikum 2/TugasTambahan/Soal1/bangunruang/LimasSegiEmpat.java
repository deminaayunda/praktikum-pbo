/**
 * File		    : LimasSegiEmpat.java
 * Tanggal      : 01/03/24
 * Penulis      : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas LimasSegiEmpat
 * */

package org.bangunruang;
import org.bangundatar.SegitigaSamaSisi;
import org.bangundatar.BujurSangkar;
public class LimasSegiEmpat {
    private BujurSangkar alas; //bujur sangkar sebagai alas
    private SegitigaSamaSisi selimut; // segitiga sama sisi sebagai selimut limas
    private double tinggi;

    public LimasSegiEmpat(BujurSangkar alas, SegitigaSamaSisi selimut){
        this.alas = alas;
        this.selimut = selimut;
        this.tinggi = Math.sqrt((selimut.getTinggiSegitiga() * selimut.getTinggiSegitiga() - (1.0/2.0 * alas.getPanjangSisi() * 1.0/2.0 * alas.getPanjangSisi())));
    }

    public double hitungVolume(){

        return (1.0/3.0) * alas.hitungLuas() * tinggi;
    }
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double luasSelimut = 4 * (0.5 * alas.getPanjangSisi() * selimut.getSisi()); // Menghitung luas selimut limas
        return luasAlas + luasSelimut;
    }
}
