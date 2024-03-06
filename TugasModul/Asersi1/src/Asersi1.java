/**
 * File		    : Asersi1.java
 * Tanggal      : 06/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: program untuk menunjukkan asersi
 * */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;

        if(x > 0){
            System.out.println("x bilangan positif");
        }
        else{
            assert (x < 0) : "ada kesalahan kode"; // kalau compile pake enable assertion bakal ngeluarin ini, kalau langsung yang bawah
            System.out.println(("x bilangan negatif"));
        }
    }
}

/**
 * asersi tuh proses ngedebug secara mandiri atau custom.
 * bikin custom message sendiri
 * dapet pesan eror sendiri
 */
