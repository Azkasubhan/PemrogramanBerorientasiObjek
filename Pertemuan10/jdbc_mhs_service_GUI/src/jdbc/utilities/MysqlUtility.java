/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author azka
 * Nama : Muhammad Azka Subhan
 * NIM  : 24060123130086
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                String url = "jdbc:mysql://localhost:3307/PBO";
                String user = "root";
                String password = "root123";
                
                koneksi = DriverManager.getConnection(url, user, password);
                
                if (koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle){
                System.out.println("Gagal koneksi : " + sqle.getMessage());
            }
        }
        return koneksi;
    }
}
