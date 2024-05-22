/*
 *	Nama File   : ReadSerializedPerson.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 22-05-2024
 *	Deskripsi   : class ReadSerializedperson
 */

import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args){
        Person person = null;
        try {
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Sererialized person name = "+person.getName());
        }
        catch (Exception ioe){
            ioe.printStackTrace();
        }
    }
}
