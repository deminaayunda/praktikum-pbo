/*
 *	Nama File   : Main.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 06-05-2024
 *	Deskripsi   : Polimorfisme adhoc coercion dan casting
 */

// a
// syarat dari overloading: nama methode sama.
// tetapi jumlah, urutan, atau tipe parameter yang beda.
// contohnya:
// sum(int a, int b)
// sum(int a, int b, int c)

// b
public class Main {
    public static void main(String[] args) {
        int output = 'a';
        System.out.println(output);
        // penjelasan:
        // berhasil, dengan output berupa nilai integer ascii nya character a (97)

        double x = 15.5;
        int output = x;
        System.out.println(output);
        // penjelasan:
        // gagal dieksekusi, karena dilakukan coercion dari double ke integer (secara implisit)
        // karena  data dalam tipe double memiliki representasi yang lebih luas (dapat menyimpan angka desimal dan bilangan bulat yang lebih besar) daripada integer.
        // sehingga harus dilakukan secara eksplisit menggunakan casting

        int y = 25;
        double output = y;
        System.out.println(output);
        // penjelasan:
        // berhasil dieksekusi, dengan dilakukan coercion (secara implisit) dari int ke double

        int z = 78;
        char output = (char) z;
        System.out.println(output);
        // penjelasan:
        // berhasil dieksekusi, dengan dilakukan casting secara eksplisit
        // dari integer ke char yang menghasilkan karakter yang sesuai dengan kode ASCII 78 ('N').

        char a = 'a';
        double output = a;
        System.out.println(output);
        // penjelasan:
        // berhasil dieksekusi, dengan dilakukan coercion (secara implisit)
        // dari character ke double menghasilkan nilai desimal ascii dari char a

    }
}