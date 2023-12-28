import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
public class KONEKSIUTS {
    


    public static Connection koneksi_DB() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("tabel_22090062_a");
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
    
}


   
    
    

