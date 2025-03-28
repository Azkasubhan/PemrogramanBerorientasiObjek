package ResponsiPBO;

public abstract class Karyawan extends CivitasAkademika{
    private String NIP;
    private int MasaKerja;
    private static int counter = 0;

    public Karyawan(String NIP, int MasaKerja, String nama, String email) {
        super(nama, email);
        this.NIP = NIP;
        this.MasaKerja = MasaKerja;
        counter++;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getMasaKerja() {
        return MasaKerja;
    }

    public void setMasaKerja(int MasaKerja) {
        this.MasaKerja = MasaKerja;
    }

    public static int getCounter() {
        return counter;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("NIP        : " + getNIP());
        System.out.println("Masa Kerja : " + getMasaKerja());
    }
}
