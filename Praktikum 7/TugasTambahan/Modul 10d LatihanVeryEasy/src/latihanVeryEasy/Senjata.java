/*
 *	Nama File   : Senjata.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 11-05-2024
 *	Deskripsi   : class Senjata
 */

package latihanVeryEasy;

public class Senjata {
    private String bunyi;
    private int peluru;

    public Senjata(String bunyi){

        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru(){
        return peluru;
    }

    public void menembak() {
        System.out.print(getBunyi() + " ");
        peluru = peluru - 1;
        System.out.println("\nSisa Peluru: " + peluru);

    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
