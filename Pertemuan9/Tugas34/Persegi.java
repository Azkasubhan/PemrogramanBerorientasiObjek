package Tugas34;

/*
 * Nama File : Persegi.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */


public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas(){
        return sisi * sisi;
    }
    
}
