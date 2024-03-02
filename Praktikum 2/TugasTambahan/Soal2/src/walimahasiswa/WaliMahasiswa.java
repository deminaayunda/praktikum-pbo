/**
 * File		    : WaliMahasiswa.java
 * Tanggal      : 01/03/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas WaliMahasiswa
 * */

package walimahasiswa;
import orang.Orang;
public class WaliMahasiswa extends Orang{ // pewarisan

    private String nomorHp, alamat;

    public WaliMahasiswa (){
        super("", ""); // default constructor
        this.nomorHp = "";
        this.alamat = "";
    }

    public String getNomorHp() {

        return nomorHp;
    }

    public String getAlamat() {

        return alamat;
    }

    public void setAlamat(String alamat) {

        this.alamat = alamat;
    }

    public void setNomorHp(String nomorHp) {

        this.nomorHp = nomorHp;
    }
}
