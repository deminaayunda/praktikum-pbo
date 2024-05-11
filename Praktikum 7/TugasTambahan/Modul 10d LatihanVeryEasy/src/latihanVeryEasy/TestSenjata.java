/*
 *	Nama File   : TestSenjata.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 11-05-2024
 *	Deskripsi   : Main class TestSenjata
 */

package latihanVeryEasy;

public class TestSenjata {
    public static void main(String[] args) {
        Senjata ak47 = new Senjata("TAR");
        Senjata m16 = new Senjata("DOR");

        System.out.println("Jumlah peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 mengisi peluru");
        ak47.setPeluru(5);
        System.out.println("Jumlah peluru AK47: " + ak47.getPeluru());
        System.out.println("AK47 menembak");
        ak47.menembak();
    }
}
