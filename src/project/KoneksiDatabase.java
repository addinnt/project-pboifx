package project;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class KoneksiDatabase {
        private static Connection koneksi;
         public static Connection getKoneksi(){
          if (koneksi == null){
           try {
               String url = "jdbc:mysql://localhost:3306/project_pbo"; // nama databasenya login
                  String user="root"; // username mysql root
                  String pass=""; //passwordnya kosong

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
               koneksi = (Connection) DriverManager.getConnection(url , user, pass);
            } 
           catch(SQLException t){
             System.out.print("Gagal melakukan koneksi ke database");
            }
        }

        return koneksi;
        }

}
