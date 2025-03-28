package ResponsiPBO;

public class Dosen extends Karyawan{
    private Fakultas fakultas;
    private static int counter = 0;

    public Dosen(Fakultas fakultas, String nama, String email, String NIP, int MasaKerja) {
        super(NIP, MasaKerja, nama, email);
        this.fakultas = fakultas;
        counter++;
    }
    
    public Fakultas getFakultas() {
        return fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public static int getCounter() {
        return counter;
    }

    public double HitungGaji(){
        return fakultas.getGajiPokok() + (getMasaKerja() * 0.1 * fakultas.getGajiPokok());
    }

    public void printInfo() {
        System.out.println("=================== Data Dosen ===================");
        super.printInfo();
        System.out.println("Fakultas   : " + getFakultas().getNama());
        System.out.printf("Gaji       : Rp%,.2f%n", HitungGaji());
        System.out.println("==================================================");
    }
}
