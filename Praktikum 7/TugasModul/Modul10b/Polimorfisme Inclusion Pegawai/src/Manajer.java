/*
 *	Nama File   : Manajer.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 06-05-2024
 *	Deskripsi   : class manajer inherits pegawai
 */
public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer (String nama){
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
