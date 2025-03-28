package ResponsiPBO;

public class MainUniv {
    public static void main(String[] args) {
        Fakultas FSM = new Fakultas("Fakultas Sains dan Matematika", 10000000, 10000000);
        FSM.printInfo();
        Mahasiswa M1 = new Mahasiswa("24060123130086", 3, FSM, "Muhammad Azka Subhan", "azka.subhan05@undip.co.id");
        M1.printInfo();
        Tendik T1 = new Tendik("12345", 2, "Paul Jason Klein", "Paul.Tendik@undip.co.id");
        T1.printInfo();
        Dosen D1 = new Dosen(FSM, "Prof. Muhammad Azka Subhan, S.Kom., M.Cs., Ph.D.", "azka.dosen@undip.co.id", "170805", 1);
        D1.printInfo();

        System.out.println("==Rincian Jumlah Civitas Akademika dan Fakultas==");
        System.out.println("Jumlah Dosen             : " + Dosen.getCounter());
        System.out.println("Jumlah Tendik            : " + Tendik.getCounter());
        System.out.println("Jumlah Mahasiswa         : " + Mahasiswa.getCounter());
        System.out.println("Jumlah Karyawan          : " + Karyawan.getCounter());
        System.out.println("Jumlah Civitas Akademika : " + CivitasAkademika.getCounter());
        System.out.println("Jumlah Fakultas          : " + Fakultas.getCounter());
        System.out.println("==================================================");

    }
}
