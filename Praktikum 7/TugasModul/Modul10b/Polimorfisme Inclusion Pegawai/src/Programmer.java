/*
 *	Nama File   : Programmer.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 06-05-2024
 *	Deskripsi   : class programmer inherits pegawai
 */

public class Programmer extends Pegawai{
    int bonus = 450000;

    public Programmer(String nama){
        super(nama);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}
