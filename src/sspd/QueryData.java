

package sspd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class QueryData {
    private Connection connect;
    private Statement stt;
    private ResultSet rss;
    
    
    
    public void Add(String sql)
    {
        connect=Koneksi.getConnection();
         try{
           stt = connect.createStatement();
           stt.executeUpdate(sql);
           JOptionPane.showMessageDialog(null, "Data Saved!");
           
           
       }catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, "Data Tidak Dapat Tersimpan:");
       }
    }
    
    
    public void Delete(String sql)
    {
          try{
            connect=Koneksi.getConnection();
            stt = connect.prepareStatement(sql);
            boolean rss = stt.execute(sql);
            JOptionPane.showMessageDialog(null, "Berhasil di Delete");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Data tidak terdelete:"+e);
        }
    }
    
    public ResultSet Search(String sql)
    {
        connect=Koneksi.getConnection();
        try {
                   
                   stt= connect.prepareStatement(sql);
                   this.rss=stt.executeQuery(sql);
                   
                  
                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return rss;
    }
    
    
    public ResultSet Edit(String sql)
    {
        return rss;
    }
    
}
