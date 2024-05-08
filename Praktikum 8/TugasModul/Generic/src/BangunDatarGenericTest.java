/*
 *	Nama File   : BangunDatarGenericTest.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 08-05-2024
 *	Deskripsi   : class main
 */

public class BangunDatarGenericTest {
    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        // Kita membuat objek bdg dari kelas BangunDatarGeneric dengan tipe generic Lingkaran.

        bdg.set(l);

        System.out.println("keliling lingkaran: "+bdg.hitungKeliling());
        System.out.println("tipe generic: "+bdg.get().getClass());

    }
}
