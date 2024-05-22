/*
 *	Nama File   : SerializedPerson.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 22-05-2024
 *	Deskripsi   : class Serializedperson
 */

import java.io.*;

public class SerializePerson {
    public static void main(String[] arg){
        Person person = new Person("Panji");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("selesai menulis objek person");
            s.close();
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}