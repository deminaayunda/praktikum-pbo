/**
 * File		    : AngkaSialException.java
 * Tanggal      : 28/02/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: Eksepsi buatan sendiri, menolak masukan angka 13
 * */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super(("jangan memasukkan angka 13 karena angka sial !!!"));
    }
}