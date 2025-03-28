package ResponsiPBO;

public abstract class CivitasAkademika {
    protected String nama;
    protected String email;
    protected static int counter = 0;

    public CivitasAkademika(String nama, String email){
        this.nama = nama;
        this.email = email;
        counter++;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }

    public void printInfo() {
        System.out.println("Nama       : " + getNama());
        System.out.println("Email      : " + getEmail());
    }
}
