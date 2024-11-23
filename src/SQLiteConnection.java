
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mhmmd
 */
public class SQLiteConnection {
    public static Connection connect() {
        Connection conn = null;
        try {
            // Path file database SQLite
            String url = "jdbc:sqlite:kontak.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
        return conn;
    }
}
