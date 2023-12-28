
package koneksi;

import java.sql.Connection;

public class ujikoneksi {
    public static void main(String[] args) {
        Connection C = Koneksi.koneksi_database();
    }
}
