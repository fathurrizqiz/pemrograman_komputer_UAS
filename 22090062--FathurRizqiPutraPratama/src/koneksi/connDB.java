/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author muhammad noval aula
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
public class connDB {
    
   public static Connection bukaCon(){
       try {
           MysqlDataSource kont = new MysqlDataSource();
           kont.setDatabaseName("uts");
           kont.setUser("root");
           kont.setPassword("");
           kont.setServerName("localhost");
           kont.setPort(8111);
           kont.setServerTimezone("Asia/Jakarta");
           Connection c = kont.getConnection();
           return c;
       } catch (Exception e) {
       }
       return null;
   }
    
}
