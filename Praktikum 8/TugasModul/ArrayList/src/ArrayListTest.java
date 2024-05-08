/*
 *	Nama File   : ArrayListTest.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 08-05-2024
 *	Deskripsi   : penerapan collections arraylist
 */

import java.util.ArrayList;
public class ArrayListTest {
    public static void main(String[] args){
        // inisialisasi Arryalist yang hanya berisi string
        ArrayList<String> strings = new ArrayList<String>(); // ini jg penerapan generic tapi udh bawaan dari java

        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        // hapus elemen
        strings.remove("praktikum");

        // iterasi pada keseluruhan ArrayList
        for (String s : strings){ //setiap s anggota strings
            System.out.print(s+" ");
        }
    }
}
