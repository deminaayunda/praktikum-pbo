/*
 *	Nama File   : MKendaraan.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 16-03-2024
 *	Deskripsi   : driver class untuk kendaraan, mobil, motor, truk
 */

package org.main;
import org.kendaraan.Kendaraan;
import org.mobil.Mobil;
import org.motor.Motor;
import org.truk.Truk;



public class MKendaraan
{
    public static void main(String[] args)
    {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Demina ");
        kendaraan.cetakInfo();
        kendaraan.setKecepatan(10);
        kendaraan.gas(20, 5);
        kendaraan.getKecepatan();
        kendaraan.berhenti();
        kendaraan.klakson();

        System.out.println("\n");
        Mobil mobil = new Mobil("Bugatti Chiron", 2);
        mobil.cetakInfo();
        mobil.bukaPintu(1);
        mobil.gas(30, 5);
        mobil.berhenti();
        mobil.klakson();

        System.out.println("\n");
        Motor motor = new Motor("Ducati Panigale V4 R", 1000);
        motor.cetakInfo();
        System.out.println("Motor Ducati Panigale V4 R diperkirakan memiliki tenaga " + motor.hitungHorsePower(16) + " HP dengan " + motor.hitungHorsePower(17) + " sebagai batas bawah dan " + motor.hitungHorsePower(15) + " sebagai batas atas interval");
        motor.klakson();

        System.out.println("\n");
        Truk truk = new Truk("Mercedes-Benz Actros", 20);
        truk.cetakInfo();
        truk.muatBarang(15);
        truk.getKapasitasMuatan();
        truk.klakson();
        truk.berhenti();
    }
}
