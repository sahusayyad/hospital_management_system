package dashboard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDB {
    
    private static Connection con;
    
    public static Connection getConnection(){
        con=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalms", "root", "root");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Creating Connection : "+ex);
            ex.printStackTrace();
        }
        return con;
    }
    
   
    
    
}
