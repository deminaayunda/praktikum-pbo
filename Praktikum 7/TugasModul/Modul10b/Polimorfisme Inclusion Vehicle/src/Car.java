/*
 *	Nama File   : Car.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 06-05-2024
 *	Deskripsi   : class Car inherit Vehicle
 */
public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare = fare-100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
