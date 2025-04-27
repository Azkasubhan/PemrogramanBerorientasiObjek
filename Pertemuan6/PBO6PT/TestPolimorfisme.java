package PBO6PT;

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);
        
        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}


/*SOAL 1 : Jelaskan manfaat polimorfisme pada kasus ini.
Jawaban : Manfaat polimorfisme pada kasus ini adalah kita dapat menggunakan satu tipe data (Pegawai) 
untuk menyimpan objek dari kelas yang berbeda (Programmer dan Manajer). Hal ini memungkinkan kita untuk 
memanggil metode yang sama (tampilData) pada objek yang berbeda tanpa perlu mengetahui tipe spesifik dari 
objek tersebut. Ini membuat kode lebih fleksibel dan mudah untuk dikembangkan.
*/


/*SOAL 2 : Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul 
jika diterapkan tanpa polimorfisme (inclusion)?
Jawaban :  Tanpa menggunakan polimorfisme, penambahan pegawai4 dan pegawai5 memerlukan pembuatan list dan 
loop yang terpisah untuk setiap jenis pegawai. Hal ini menyebabkan kode menjadi berulangdan kurang efisien.*/