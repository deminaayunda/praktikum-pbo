/*
 *	Nama File   : LambdaList.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 29-05-2024
 *	Deskripsi   : Implementasi lambda pada list, digunakan sebagai parameter method
 */

import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));

        // lambda menggunakan blok statement
        mahasiswaList.forEach((nama) -> {
            System.out.println(nama);
        });
    }
}
