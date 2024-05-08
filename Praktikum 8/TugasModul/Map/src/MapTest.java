/*
 *	Nama File   : MapTest.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 08-05-2024
 *	Deskripsi   : collections map
 */
import java.util.*;
public class MapTest {
    public static void main(String[] args){
        // kunci -> integer, nilai -> string
        Map<Integer, String> map = new HashMap<Integer, String>();

        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        map.put(3, "tiga");
        map.put(4, "empat");

        // mengambil atau mengeprint elemen pertama, berdasarkan kuncinya
        System.out.println(map.get(1));

        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet(); //collection set baru bernama key, yang isinya kunci

        // bagaimana iterasi untuk mengambil keseluruhan
        // nilai dari kunci? tulis di laporan
        // gunakan iterasi seperti di array

        for (String v : map.values()){ // untuk setiap v anggota dari
            System.out.print(v +" ");
        }

    }
}

