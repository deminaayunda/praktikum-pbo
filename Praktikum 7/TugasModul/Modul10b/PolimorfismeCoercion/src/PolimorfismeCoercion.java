/*
 *	Nama File   : PolimorfismeCoercion.java
 *	Pembuat	    : Demina Ayunda Chesara
 *	NIM         : 24060122140149
 *	Tanggal     : 06-05-2024
 *	Deskripsi   : Polimorfisme adhoc coercion
 */

public class PolimorfismeCoercion {
    public static int kuadrat(int bilangan){
        return bilangan*bilangan;
    }

    public static void main(String[] args){
        // deklarasi objek int
        Integer bilangan = 10;

        // objek integer 'dipaksa' untuk diubah menjadi primitif
        int hasilKuadrat = kuadrat(bilangan);

        System.out.printf("hasil kuadrat %d adalah %d", bilangan, hasilKuadrat);
    }
}
