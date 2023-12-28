
package koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
public class Koneksi {
    


    public static Connection koneksi_database() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("DB_absen");
            m.setServerName("localhost");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");
            
            Connection C = m.getConnection();
            System.out.println("sukses terhubung ke database");
            return C;
           
                    
         } catch (Exception e) {
            //penanganan eror
            System.out.println("gagal terhubung ke database");
            System.out.println("Eror: "+ e.getMessage());
            
        }
        return null;
    }

    static Connection koneksi_DB() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


   
    
    

