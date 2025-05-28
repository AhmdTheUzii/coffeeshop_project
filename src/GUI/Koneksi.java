package GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP 14S
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/coffeeshop_db";
                String user = "root";
                String pass = "";
                
                // Untuk MySQL Connector 9.3.0, gunakan driver yang baru
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi berhasil");   
            } catch (ClassNotFoundException e) {
                System.out.println("Driver tidak ditemukan: " + e.getMessage());
            } catch (SQLException e) {
                System.out.println("Koneksi gagal! : " + e.getMessage());
            }
        }
        return koneksi; // INI YANG DIPERBAIKI - sebelumnya return null
    }
    
    // Method ini yang dipanggil di login, jadi harus mengarah ke getKoneksi()
    public static Connection getConnection() {
        return getKoneksi(); // INI YANG DIPERBAIKI - sebelumnya throw UnsupportedOperationException
    }

    static void resetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}