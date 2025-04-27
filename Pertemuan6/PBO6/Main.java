package PBO6;

public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Tom");
        Anjing anjing = new Anjing("Bolt");
        Burung burung = new Burung("Rio");
        
        System.out.println("Nama Kucing : " + kucing.nama);
        kucing.gerak();
        kucing.bersuara();

        System.out.println("Nama Anjing : " + anjing.nama);
        anjing.gerak();
        anjing.bersuara();

        System.out.println("Nama Burung : " + burung.nama);
        burung.gerak(); 
        burung.bersuara();
    }
}
