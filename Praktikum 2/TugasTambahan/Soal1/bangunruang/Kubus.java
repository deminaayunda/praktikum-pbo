/**
 * File		    : Kubus.java
 * Tanggal      : 01/03/24
 * Penulis      : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas Kubus
 * */

package org.bangunruang;
import org.bangundatar.BujurSangkar;

public class Kubus
{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan)
    {

        this.permukaan = permukaan;
    }

    public double hitungVolume()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }

    public double hitungLuasAlas()
    {
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    }
}
