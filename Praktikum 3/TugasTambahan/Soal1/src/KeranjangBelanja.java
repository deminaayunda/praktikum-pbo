/**
 * File		    : KeranjangBelanja.java
 * Tanggal      : 09/03/2024
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: file KeranjangBelanja dengan asersi
 * */
public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        // TO DO : Tambahkan logika untuk menambahkan item ke atribut keranjang berikan asersi jika keranjang sudah penuh
        assert (count < 5) : "keranjang sudah penuh";
        keranjang[count] = item;
        count++;

    }

    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}
