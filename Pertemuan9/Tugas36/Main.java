/*
 * Nama file : Main.java
 * Nama      : Muhammad Azka Subhan
 * NIM       : 24060123130086
 */

public class Main {
    public static void main(String[] args) {
        KoleksiGenerik<Anabul> koleksi = new KoleksiGenerik<>();

        koleksi.add(new Kucing("Tom"));
        koleksi.add(new Anjing("Bolt"));
        koleksi.add(new Burung("Rio"));
        koleksi.add(new Kucing("Jerry"));
        koleksi.add(new Anjing("Max"));
        koleksi.add(new Burung("Tweety"));
        koleksi.add(new Kucing("Garfield"));
        koleksi.add(new Anjing("Buddy"));
        koleksi.add(new Burung("Polly"));
        koleksi.add(new Kucing("Sylvester"));

        koleksi.showAll();
    }
}
