

package sspd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Koneksi {
    
    private static Connection connect;
    
    
        public static void Connect(){
            
            try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/surat_penugasan_dosen", "root", "");
                
                
            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Tidak Konek:"+ e);
            }
            
        }
        
         public static Connection getConnection() {
        if (connect == null) {
            Connect();
        }
        return connect;
    }
    
}
