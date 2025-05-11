/*
 * Nama File  : Anjing.java
 * Nama       : Muhammad Azka Subhan
 * NIM        : 24060123130086
 */

public class Anjing extends Anabul{
    public Anjing(){
        super();
    }

    public Anjing(String nama){
        super(nama);
    }

    public void gerak(){
        System.out.println("Anjing " + nama + " bergerak dengan melata");
    }

    public void bersuara(){
        System.out.println("Anjing " + nama + " bersuara guk-guk");
    }
}
