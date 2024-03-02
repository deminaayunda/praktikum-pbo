/**
 * File		    : MLimasSegiEmpat.java
 * Tanggal      : 01/03/24
 * Penulis      : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas LimasSegiEmpat
 * */
package org.main;

import org.bangundatar.BujurSangkar;
import org.bangundatar.SegitigaSamaSisi;
import org.bangunruang.LimasSegiEmpat;

public class MLimasSegiEmpat {
    public static void main(String[] args){
        BujurSangkar alas = new BujurSangkar(8);
        SegitigaSamaSisi selimut = new SegitigaSamaSisi(9);
        LimasSegiEmpat limas = new LimasSegiEmpat(alas, selimut);

        System.out.println(("Volume Limas Segiempat: " + limas.hitungVolume()));
        System.out.println("Luas permukaan Limas Segiempat: " + limas.hitungLuasPermukaan());


    }
}
/**
 * KESIMPULAN
 * LimasSegiEmpat menggunakan konsep agregasi dengan SegitigaSamaSisi dan BujurSangkar.
 * Dimana LimasSegiEmpat memiliki objek SegitigaSamaSisi dan BujurSangkar,
 * dan menggunakan metode yang ada di kelas-kelas tersebut untuk menghitung volume dan luas permukaan limas.

 * BujurSangkar dan SegitigaSamaSisi, adalah turunan dari kelas Poligon, dapat dilihat dari kode dengan adanya "extends".
 * Ini berarti kelas-kelas tersebut mewarisi sifat-sifat dari kelas Poligon.
 *
 * import digunakan untuk mengimpor kelas atau paket yang diperlukan ke dalam file program saat kompilasi.
 * jadi saat melakukan agregasi atau merupakan sebuah pewarisan dibutuhkan "import" agar dapat diakses
 */