/*
 *	Nama File   : MPoligon.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 13-03-2024
 *	Deskripsi   : driver class untuk menguji segitiga dan persegipanjang
 */
package org.main;
import org.bangundatar.*; //import semua class di bangundatar
public class  MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(7, 10, 4);
        persegi.printInfo();
        System.out.println(("Luas Persegi Panjang : "+persegi.hitungLuas()));

        Segitiga segitiga = new Segitiga(3,3, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga :" + segitiga.hitungLuas());
    }
}





