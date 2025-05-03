/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanTurtorial;

/**
 *
 * @author azka
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        menusuk = false;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    private String getBunyi(){
        return this.bunyi;
    }
    
    private void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    private boolean isMenusuk(){
        return this.menusuk;
    }
    
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.println(getBunyi() + " ");
        }
        System.out.println("");
    }
    
    public String menusuk(){
        if (isMenusuk()){
            return "Jleb!";
        }
        return "Gagal, belum terpasang bayonet";
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}
