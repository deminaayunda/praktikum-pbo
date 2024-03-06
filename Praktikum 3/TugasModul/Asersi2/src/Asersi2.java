/**
 * File		    : Asersi2.java
 * Tanggal      : 06/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang kurang dari sama dengan nol
 * */
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0) : "jari-jari tidak boleh kurang dari sama dengan nol!!!"; // kalo kondisi () memenuhi dia ngeskip, kalo ga memenuhi dia masuk
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "+ kelilingLingkaran);

    }
}

/**
 * tidak terdapat kesalahan pada metode tersebut secara konsep
 * hanya memiliki kekurangan dalam pesan yang dikeluarkan, ditambahkan "jari-jari tidak boleh kurang dari sama dengan nol!!!"
 * agar lebih tepat karena sebelumnya hanya "tidak boleh sama dengan nol"
 */

