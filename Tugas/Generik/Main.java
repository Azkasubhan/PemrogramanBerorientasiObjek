package Generik;

public class Main {
    public static void main(String[] args){
        Datum<Kucing> Kucing = new Datum<>(new Kucing("Tom"));
        Datum<Anjing> Anjing = new Datum<>(new Anjing("Bolt"));
        Datum<Burung> Burung = new Datum<>(new Burung("Rio"));

        ContohMetodeGenerik.printInfo(Kucing);
        ContohMetodeGenerik.printInfo(Anjing);
        ContohMetodeGenerik.printInfo(Burung);
    }
}
