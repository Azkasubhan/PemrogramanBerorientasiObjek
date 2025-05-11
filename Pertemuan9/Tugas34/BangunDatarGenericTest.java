package Tugas34;

/*
 * Nama File : BangunDatarGenericTest.java
 * Nama : Muhammad Azka Subhan
 * NIM : 24060123130086
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(5);
        Persegi persegi = new Persegi(3);
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 5);
        Segitiga segitiga = new Segitiga(3, 3, 3);

        BangunDatarGeneric<Lingkaran> bdgLingkaran = new BangunDatarGeneric<Lingkaran>();
        BangunDatarGeneric<Persegi> bdgPersegi = new BangunDatarGeneric<Persegi>();
        BangunDatarGeneric<PersegiPanjang> bdgPersegiPanjang = new BangunDatarGeneric<PersegiPanjang>();
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();

        bdgLingkaran.set(lingkaran);
        bdgPersegi.set(persegi);
        bdgPersegiPanjang.set(persegiPanjang);
        bdgSegitiga.set(segitiga);

        System.out.println("luas lingkaran : " + bdgLingkaran.hitungLuas());
        System.out.println("keliling lingkaran : " + bdgLingkaran.hitungKeliling());
        System.out.println("tipe generic : " + bdgLingkaran.get().getClass().getName());

        System.out.println("luas persegi : " + bdgPersegi.hitungLuas());
        System.out.println("keliling persegi : " + bdgPersegi.hitungKeliling());
        System.out.println("tipe generic : " + bdgPersegi.get().getClass().getName());

        System.out.println("luas persegi panjang : " + bdgPersegiPanjang.hitungLuas());
        System.out.println("keliling persegi panjang : " + bdgPersegiPanjang.hitungKeliling());
        System.out.println("tipe generic : " + bdgPersegiPanjang.get().getClass().getName());

        System.out.println("luas segitiga : " + bdgSegitiga.hitungLuas());
        System.out.println("keliling segitiga : " + bdgSegitiga.hitungKeliling());
        System.out.println("tipe generic : " + bdgSegitiga.get().getClass().getName());
    }
}



