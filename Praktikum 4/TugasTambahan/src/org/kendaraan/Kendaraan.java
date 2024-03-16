/*
 *	Nama File   : Kendaraan.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 16-03-2024
 *	Deskripsi   : Class Kendaraan sebagai induk
 */
package org.kendaraan;

public class Kendaraan {
    protected String nama;
    protected int kecepatan;

    public Kendaraan (String nama){
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    public void cetakInfo(){
        System.out.println("Nama: "+ nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
    public void gas(int kecepatan, int durasi){
        this.kecepatan += kecepatan;
        System.out.println("Kecepatan bertambah menjadi " + this.kecepatan + " km/jam" + " selama " + durasi + " detik ");
    }
    public void berhenti(){
        kecepatan = 0;
        System.out.println("Kendaraan berhenti");
    }
    public void klakson() {
        System.out.println(nama + "berbunyi");
    }
}
