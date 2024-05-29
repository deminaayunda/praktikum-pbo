/*
 *	Nama File   : LambdaMap.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 29-05-2024
 *	Deskripsi   : Implementasi lambda pada map
 */

import java.util.*;
public class LambdaMap {
    public static void main(String[] args){
        Map<String, String> MahasiswaMap = new HashMap<String, String>();
        MahasiswaMap.put("24060122140149", "Demina Ayunda Chesara");
        MahasiswaMap.put("24060122120013", "Rania");
        MahasiswaMap.put("24060122130051", "Miriam Stefani Abigail");

        // dengan lambda ekspresi
        MahasiswaMap.forEach((nim, nama) -> System.out.println(nim+" "+ nama));

        // dengan lambda blok statement
        MahasiswaMap.forEach((nim, nama) -> {
            System.out.println(nim+" "+nama);
        });
    }
}
