package Generik;

public class ContohMetodeGenerik {
    public static <G extends Anabul> void printInfo(Datum<G> datum){
        datum.getIsi().gerak();
        datum.getIsi().bersuara();
    }
}
