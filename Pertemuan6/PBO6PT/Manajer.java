package PBO6PT;

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer() {
        super();
    }

    public Manajer(String nama) {
        super(nama);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
