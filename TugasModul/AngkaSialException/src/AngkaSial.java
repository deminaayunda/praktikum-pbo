/**
 * File		    : AngkaSial.java
 * Tanggal      : 06/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: program penggunaan exception buatan sendiri
 *                pengenalan klausa 'throw' dan 'throws'
 * */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");

    }
    public static void main(String [] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch (AngkaSialException ase){ //as e -> as error (hanya penamaan)
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/**
 * *Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * tetap dijalankan karena as.cobaAngka(10); itu dia tidak memasuki kondisi == 13, jadi masih dieksekusi
 * tetapi ketika as.cobaAngka(13); itu dijalankan, dia tidak mengeksekusi baris 12, karena dia masuk ke kondisi if dimana dia == 13, dan melakukan throw
 * *
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
 * Dieksekusi, karena terdapat as.cobaAngka(13); itu == 13, maka dari itu dia masuk ke bagian catchnya (menangkap error) dan menjalankan baris 21
 * baris 21 diekseskusi setelah masuk ke throws
 */
