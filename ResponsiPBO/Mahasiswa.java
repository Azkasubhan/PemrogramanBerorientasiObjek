package ResponsiPBO;

public class Mahasiswa extends CivitasAkademika{
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    public Mahasiswa(String NIM, int semester, Fakultas fakultas, String nama, String email) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
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

    public double HitungUKT(){
        double UKT = fakultas.getTarifUKT();
        for (int i = 1; i < semester; i++){
            UKT *= 0.95;
        }
         return UKT;
    }

    public void printInfo() {
        System.out.println("================ Data Mahasiswa =================");
        super.printInfo();
        System.out.println("NIM        : " + getNIM());
        System.out.println("Semester   : " + getSemester());
        System.out.println("Fakultas   : " + getFakultas().getNama());
        System.out.printf("Tarif UKT  : Rp%,.2f%n", HitungUKT());
        System.out.println("=================================================");
    }


}
