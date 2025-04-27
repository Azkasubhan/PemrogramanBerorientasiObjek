package PBO6;

public abstract class Anabul {
    protected String nama;

    public Anabul(){
        this.nama = "-";
    }

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}
