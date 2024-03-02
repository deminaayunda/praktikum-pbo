/**
 * File		    : MKubus.java
 * Tanggal      : 01/03/24
 * Penulis      : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File Main Kubus
 * */
package org.main;
import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus
{
    public static void main(String[] args)
    {
        BujurSangkar bujurSangkar = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujurSangkar);
        System.out.println("Luas permukaan kubus dengan panjang sisi 4 satuan: " + kubus.hitungLuasAlas());
        System.out.println("Volume kubus dengan panjang sisi 4 satuan: " + kubus.hitungVolume());
    }
}
