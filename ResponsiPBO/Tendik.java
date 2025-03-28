package ResponsiPBO;

public class Tendik extends Karyawan{
    private static int counter = 0;

    public Tendik(String NIP, int MasaKerja, String nama, String email) {
        super(NIP, MasaKerja, nama, email);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public double HitungGaji(){
        return 4000000 + (getMasaKerja() * 0.1 * 4000000);
    }

    public void printInfo() {
        System.out.println("================== Data Tendik===================");
        super.printInfo();
        System.out.printf("Gaji       : Rp%,.2f%n", HitungGaji());
        System.out.println("==================================================");
    }
}
