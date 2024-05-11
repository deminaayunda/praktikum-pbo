/*
 *	Nama File   : TestSenjata.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 11-05-2024
 *	Deskripsi   : Main class TestSenjata
 */

package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;


    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {

        return peluru;
    }

    public boolean isMenusuk() {

        return menusuk;
    }
    public void setBunyi(String bunyi) {

        this.bunyi = bunyi;
    }
    public void setMenusuk(boolean menusuk) {

        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru) {

        this.peluru = peluru;
    }




}
