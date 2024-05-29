/*
 *	Nama File   : DiskonLambda.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 29-05-2024
 *	Deskripsi   : Ekspresi lambda dasar, digunakan untuk menghitung diskon
 */

interface IDiskon {
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args){
        //tanpa lambda
        IDiskon diskonMerdeka = new IDiskon(){
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        // dengan lambda ekspresi
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        // dengan lambda blok statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }

    // perbedaan aantara diskonLebaran dan diskobBiasa itu, diskon Lebaran menggunakan lambda ekspresi
    // sedangkan diskonBiasa menggunakan lambda blok statement, ada nilai kembalinya
}

