/**
 * File		    : Anggota.java
 * Tanggal      : 09/03/2024
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas anggota dengan throw dan throws
 * */

public class Anggota {
    private String nama;
    private Buku[] bukuPinjaman;
    private int jumlahBukuPinjaman;

    public Anggota(String nama) {
        this.nama = nama;
        bukuPinjaman = new Buku[3];
        jumlahBukuPinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public Buku[] getBukuPinjaman() {
        return bukuPinjaman;
    }

    public int getJumlahBukuPinjaman() {
        return jumlahBukuPinjaman;
    }

    public void pinjamBuku(Buku buku) throws MaksimumBukuTerpinjamException, BukuTidakTersediaException {
        // TODO 2: Buat kondisi untuk mencegah jumlah buku yang dipinjam melebihi 3 dengan throw keyword
        if (jumlahBukuPinjaman >= 3){ // karena index dari 0
            throw new MaksimumBukuTerpinjamException("Anggota sudah mencapai batas maksimum peminjaman buku");
        }
        // TODO 3: Buat kondisi untuk mencegah buku yang tidak tersedia dipinjam dengan throw keyword
        else if (!buku.isTersedia()) {
            throw new BukuTidakTersediaException("Mohon maaf, Buku tidak tersedia");
        }
        buku.setTersedia(false);
        bukuPinjaman[jumlahBukuPinjaman] = buku;
        jumlahBukuPinjaman++;
    }

}
