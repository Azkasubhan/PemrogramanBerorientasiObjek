/*
 * Nama File : Burung.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */

public class Burung extends Anabul{
    public Burung(){
        super();
    }

    public Burung(String nama){
        super(nama);
    }

    public void gerak(){
        System.out.println("Burung " + nama + " bergerak dengan terbang");
    }

    public void bersuara(){
        System.out.println("Burung " + nama + " bersuara cuit");
    }
}
