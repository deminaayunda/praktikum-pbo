/*
 *	Nama File   : Person.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 22-05-2024
 *	Deskripsi   : class person
 */

public class Person {
    public int id;
    private String name;

    public Person(String n){

        name = n;
    }
    public Person(int i, String n){
        id = i;
        name = n;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }
}
