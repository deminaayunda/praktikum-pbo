/*
 *	Nama File   : MLingkaran.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 20-03-2024
 *	Deskripsi   : Main class untuk menguji interface dari class lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari lingkaran : ");
        double jejari = scan.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + lingkaran.hitungLuas());
    }
}