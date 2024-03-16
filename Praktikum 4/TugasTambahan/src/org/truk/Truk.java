/*
 *	Nama File   : Truk.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 16-03-2024
 *	Deskripsi   : Class Truk turunan dari class Kendaraan
 */

package org.truk;
import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    private int kapasitasMuatan;
    private int beratMuatan;

    public Truk (String nama, int kapasitasMuatan){
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getBeratMuatan() {
        return beratMuatan;
    }

    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jenis kendaraan: Truk");
        System.out.println("Kapasitas muatan: " + kapasitasMuatan + " ton");
        System.out.println("Berat muatan: " + beratMuatan + " ton");
    }

    public void muatBarang (int berat){
        int totalBerat = beratMuatan + berat;
        if (totalBerat <= kapasitasMuatan) {
            beratMuatan = totalBerat;
            System.out.println("Barang dengan berat " + berat + " ton berhasil dimuat");
            System.out.println("Berat muatan sekarang: " + beratMuatan + " ton");
        } else {
            System.out.println("Barang tidak bisa dimuat karena melebihi kapasitas muatan");
        }
    }

    @Override
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Honk Honk!");
    }
}
