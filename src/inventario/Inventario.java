
package inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Inventario {

    public static void main(String[] args) {
//        new Signup().setVisible(true);
          
        String databaseURL = "jdbc:mysql://localhost:3306/inventario?user=root&password=skymax";

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(databaseURL);
            if (conn != null) {
                System.out.println("Connected to the database");
                
                String selectTableSQL = "select nombre from medico where idmedico = 4 limit 1";
                Statement statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(selectTableSQL); 
                
                if (rs.next()) {
                    String username = rs.getString("nombre");
                    System.out.println(username);
                }else{
                    System.out.println("rs is empty");
                }
                
//                String username = rs.getString("nombre");
//                System.out.println(username);
                

            }
        } catch (SQLException ex) {
            
            
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
