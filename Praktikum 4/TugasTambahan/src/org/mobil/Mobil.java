/*
 *	Nama File   : Mobil.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 16-03-2024
 *	Deskripsi   : Class Mobil turunan dari class Kendaraan
 */
package org.mobil;
import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;

    public Mobil(String nama, int jumlahPintu){
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Mobil");
        System.out.println("Jumlah pintu: " + jumlahPintu);
    }
    public void bukaPintu(int nomorPintu){
        if (nomorPintu<=getJumlahPintu()) {
            System.out.println("Nomor pintu mobil yang terbuka adalah " + nomorPintu);
        }else{
            System.out.println("Tidak ada nomor pintu " + nomorPintu + " pada  mobil ini");
        }
    }

    @Override
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Vroom Vroom!");
    }
}
