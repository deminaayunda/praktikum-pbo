/**
 * File		    : ExceptionOnArray.java
 * Tanggal      : 06/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: program penggunaan eksepsi menggunakan class library java
 * */
public class ExceptionOnArray {
    public static void main(String[] args) {

        Integer[] arrayInteger = new Integer[4];
        try { //wajib
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException exception){ // wajib
            exception.printStackTrace();
        }
        finally { // optional, selalu diprint mau gmn pun caranya
            System.out.println("Clean up code...");
        }

    }
}