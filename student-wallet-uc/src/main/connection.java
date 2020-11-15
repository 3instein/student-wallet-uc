
package main;

import java.sql.*;
import javax.swing.JOptionPane;

public class connection {
    Connection conn;
    Statement stmt;
    
    public void config(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/student_wallet" , "root", "");
            stmt = conn.createStatement();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Connection Failed" + e.getMessage());
        }
    }
}
