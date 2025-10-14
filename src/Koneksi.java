import java.io.*;
import java.sql.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Moreno
 */
public class Koneksi {
    private static Connection con = null;
    private final static String jdbcDriver = "com.mysql.jdbc.Driver";
    private final static String url = "jdbc:mysql://localhost:3306/test";
    private final static String user = "root";
    private final static String pswd = "moreno";
    
    public static Connection GetConnection() {
        if(con == null) {
            try  {
                Class.forName(jdbcDriver);
                System.out.println("Mencoba membangun koneksi...");
                con = DriverManager.getConnection(url, user, pswd);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        if(con != null)System.out.println("Koneksi berhasil");
        return con;
    }
    public static void CloseConnection() {
        try {
            System.out.println("Menutup koneksi...");
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
