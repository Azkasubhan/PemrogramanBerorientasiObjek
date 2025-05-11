package Tugas34;

/*
 * Nama File : BangunDatarGeneric.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */


public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }

    public double hitungLuas(){
        return bangunDatar.hitungLuas();
    }
}
