/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc.program;

import java.util.ArrayList;
import java.util.List;

import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
/**
 *
 * @author azka
 * Nama : Muhammad Azka Subhan
 * NIM  : 24060123130086
 */
public class Program {

    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        // Tambah data awal
        System.out.println("===insert awal");
        service.add(new Mahasiswa(1, "Nina"));
        service.add(new Mahasiswa(2, "Rudi"));
        service.add(new Mahasiswa(3, "Beni"));
        System.out.println("Berhasil insert data awal");
        System.out.println("===displayAll");
        displayAll();

        // INSERT Haryo
        System.out.println("\n===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("Berhasil insert");
        System.out.println("berhasil insert: " + mhsAdd);
        System.out.println("===displayAll");
        displayAll();

        // UPDATE Haryo → Dinaya
        System.out.println("\n===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        System.out.println("Berhasil update");
        System.out.println("===displayAll");
        displayAll();

        // DELETE Dinaya
        System.out.println("\n===delete");
        Mahasiswa mhsToDelete = service.getById(5);
        System.out.println("akan di delete: " + mhsToDelete);
        service.delete(5);
        System.out.println("Berhasil delete");
        System.out.println("===displayAll");
        displayAll();
    }

    public static void displayAll() {
        List<Mahasiswa> listMhs = service.getAll();
        for (Mahasiswa m : listMhs) {
            System.out.println(m);
        }
    }
}
