package GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    
    // HAPUS static Connection koneksi; // INI PENYEBAB MASALAH!
    
    public static Connection getConnection() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/coffeeshop_db";
            String user = "root";
            String pass = "";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // SELALU BUAT CONNECTION BARU - JANGAN DISIMPEN!
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi berhasil dibuat");
            return conn;
            
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan: " + e.getMessage());
            throw new SQLException("Driver tidak ditemukan", e);
        }
    }
    
    // HAPUS getKoneksi() method - gak perlu lagi
}