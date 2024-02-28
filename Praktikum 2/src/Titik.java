/**
 * File		    : Titik.java
 * Tanggal      : 28/02/24
 * Nama penulis : Demina Ayunda Chesara
 * NIM          : 24060122140149
 * Deskripsi	: File kelas Titik
 * */
public class Titik
{
    private double absis, ordinat;
    static double counterTitik;

    public Titik()
    {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double o)
    {
        absis = a;
        ordinat = o;
        counterTitik++;
    }


    public void setAbsis(double a)
    {
        absis = a;
    }

    public void setOrdinat(double o)
    {
        ordinat = o;
    }

    public double getAbsis()
    {
        return absis;
    }

    public double getOrdinat()
    {
        return ordinat;
    }

    public static double getCounterTitik()
    {
        return counterTitik;
    }

    public double getJarakPusat() {
        return Math.sqrt((absis*absis)+(ordinat*ordinat));
    }
    public void refleksiX(Titik X){
        double ordinat = X.getOrdinat();
        ordinat = ordinat*(- 1);
        X.setOrdinat(ordinat);
    }
    public void refleksiY(Titik Y){
        double absis = Y.getAbsis();
        absis = absis*(- 1);
        Y.setOrdinat(absis);
    }
    public void getRefleksiX(Titik t){
        refleksiX(t);
    }

    public void getRefleksiY(Titik T){
        refleksiY(T);
    }
}

