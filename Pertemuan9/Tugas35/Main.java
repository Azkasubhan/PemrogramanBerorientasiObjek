/*  
*  Nama File : Main.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksi = new Koleksi<>();

        koleksi.add('A');
        koleksi.add('Z');
        koleksi.add('K');
        koleksi.add('A');
        koleksi.add('S');
        koleksi.add('U');
        koleksi.add('B');
        koleksi.add('H');
        koleksi.add('A');
        koleksi.add('N');

        koleksi.showAll();
        System.out.println("Jumlah elemen : " + koleksi.getSize());
        System.out.println("Elemen ke 1 : " + koleksi.getIsi(0));
        koleksi.setIsi(1, 'S');
        koleksi.showAll();
        koleksi.add('A');
        koleksi.showAll();
        koleksi.delete(10);
        koleksi.showAll();
        koleksi.setIsi(1, 'Z');
        koleksi.showAll();
    }
}
