/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ram Sundar
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    static Connection conn=null;
ResultSet rs;
PreparedStatement pst;
    
    public static Connection ConnecrDb(){
        try{
conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=123456789;DatabaseName=Bank"); 
return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
