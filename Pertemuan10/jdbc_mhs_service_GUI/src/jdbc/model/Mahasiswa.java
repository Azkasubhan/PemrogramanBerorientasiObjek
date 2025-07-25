package jdbc.model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author azka
 * Nama : Muhammad Azka Subhan
 * NIM  : 24060123130086
 */
public class Mahasiswa {
    private int id;
    private String nama;
    
    public Mahasiswa(){
        nama = "-";
    }
    
    public Mahasiswa(String nama){
        this.nama = nama;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String toString(){
        return "Mahasiswa {" +"id = " + id + ", nama =" + nama + "}";
    }
}
