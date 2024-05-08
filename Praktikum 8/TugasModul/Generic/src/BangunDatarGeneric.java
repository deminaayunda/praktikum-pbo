/*
 *	Nama File   : BangunDatarGeneric.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 08-05-2024
 *	Deskripsi   : class bangundatargeneric dengan objek t yang dibatasi bangundatar
 */
public class BangunDatarGeneric<T extends BangunDatar>{ //dibatesin T nya itu bangundatar
    private T bangunDatar; // variabel bangundatar tipe t, menyimpan objek turunan bangundatar

    public void set(T tipeBangunDatar){ // mengatur objek bangundatar dengan objek dari kelas turunan bangundatar

        bangunDatar = tipeBangunDatar; // ngeset supaya tipe datanya sesuai
    }
    public T get(){

        return bangunDatar;
    }
    public double hitungKeliling(){

        return bangunDatar.hitungKeliling();
    }
}

// ketika T diganti ke T1 atau segala T1234 tidak merubah apapun
// karena hanya sebuah nama tipe yang bisa diganti dengan apapun