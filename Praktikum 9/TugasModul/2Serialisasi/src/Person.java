/*
 *	Nama File   : Person.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 22-05-2024
 *	Deskripsi   : class person
 */

import java.io.Serializable;

class Person implements Serializable {
    private String name;
    public Person(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
