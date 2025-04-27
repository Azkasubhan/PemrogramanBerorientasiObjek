package PBO6PT;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer() {
        super();
    }

    public Programmer(String nama) {
        super(nama);
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}
