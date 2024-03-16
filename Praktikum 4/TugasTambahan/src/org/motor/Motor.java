/*
 *	Nama File   : Motor.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 16-03-2024
 *	Deskripsi   : Class Motor turunan dari class Kendaraan
 */
package org.motor;
import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan{
    private int cc;

    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Motor");
        System.out.println("Kapasitas mesin: " + cc + " cc") ;
    }

    public double hitungHorsePower(int angka) {
        if (angka >= 15 && angka < 18) {
            return ((double)getCc() / (double)angka);
        } else {
            return 0;
        }
    }

    @Override
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Womp Womp!");
    }
}