/*
 *	Nama File   : Pegawai.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 06-05-2024
 *	Deskripsi   : class pegawai
 */
public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000 ;
    public Pegawai(String nama){
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama: " + getNama());
        System.out.println("Gaji pokok: " + getGajiPokok());
    }
}
