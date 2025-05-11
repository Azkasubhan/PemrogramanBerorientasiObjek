/*
 * Nama File : Kucing.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */

public class Kucing extends Anabul{

    public Kucing(){
        super();
    }

    public Kucing(String nama){
        super(nama);
    }

    public void gerak(){
        System.out.println("Kucing " + nama + " bergerak dengan melata"); ;
    }

    public void bersuara(){
        System.out.println("Kucing " + nama + " bersuara meong");
    }
}
