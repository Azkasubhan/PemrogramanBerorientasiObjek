import java.util.ArrayList;

/*
 * Nama File : KoleksiGenerik.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */

public class KoleksiGenerik <T>{
    private ArrayList<T> wadah = new ArrayList<>();

    public void add(T elemen){
        wadah.add(elemen);
    }

    public void showAll(){
        for (T elemen : wadah){
            if (elemen instanceof Anabul){
                Anabul anabul = (Anabul) elemen;
                System.out.println("Nama : " + anabul.nama);
                anabul.gerak();
                anabul.bersuara();
                System.out.println();
            }
        }
    }
}
