package PBO6PT;

public class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public Pegawai() {
        this.nama = "-";
    }

    public Pegawai(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}
