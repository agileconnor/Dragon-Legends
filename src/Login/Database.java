/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Connor
 */
public class Database {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (Exception ex){
            System.out.println("Error Loading Driver");
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DragonWars" + "user=root&password=cb5024");
        }catch(SQLException ex) {
            System.out.println("SQLexception: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
    }
}
