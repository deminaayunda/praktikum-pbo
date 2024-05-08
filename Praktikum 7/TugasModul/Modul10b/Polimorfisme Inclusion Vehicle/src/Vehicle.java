/*
 *	Nama File   : Vehicle.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 06-05-2024
 *	Deskripsi   : class parent vehicle
 */

public class Vehicle {
    void calRent(int distance, float price){
        float fare = distance * price;
        System.out.println("vehicle price = "+fare);
    }
}
