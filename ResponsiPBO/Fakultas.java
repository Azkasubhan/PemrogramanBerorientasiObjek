package ResponsiPBO;

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;
    private static int counter = 0;

    public Fakultas(){
        nama = "";
        tarifUKT = 0;
        gajiPokok = 0;
        counter++;
    }

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
        counter++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public static int getCounter() {
        return counter;
    }

    public void printInfo() {
        System.out.println("================= Data Fakultas =================");
        System.out.println("Nama Fakultas : " + getNama());
        System.out.printf("Tarif UKT     : Rp%,.2f%n", getTarifUKT());
        System.out.printf("Gaji Pokok    : Rp%,.2f%n", getGajiPokok());
        System.out.println("=================================================");
    }

}
