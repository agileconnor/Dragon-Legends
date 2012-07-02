/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;
import Database.Database;
import Input.UserInput;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Connor
 */
public class Login {
    public static boolean LoginStart() throws SQLException {
        boolean suc = false;
        String DPass = null;
        System.out.print("User: ");
        String User = UserInput.get();
        System.out.print("Password: ");
        String Pass = UserInput.get();
        Connection con = Database.getConnection();
        Statement stmt = null;
        String query = "select * from Login where User = '" + User + "'";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (rs.first() == true) {
                DPass = rs.getString("Pass");
            }else{
                System.out.println("No Such User Name");
            }
        }catch (SQLException e) {
            System.out.println("SQL Retrival Error");
            System.out.println("SQL Error: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally {
          if (stmt != null) { stmt.close(); }
        }
        if (Pass.equals(DPass)) {
                suc = true;
            }
        return suc;
    }  
}
