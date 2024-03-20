/*
 *	Nama File   : MBujurSangkar.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 20-03-2024
 *	Deskripsi   : Main class untuk abstract dari class BujurSangkar
 */
import java.util.Scanner;
public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
