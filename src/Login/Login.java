/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
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
        System.out.print("User: ");
        String User = UserInput.get();
        System.out.print("Password: ");
        String Pass = UserInput.get();
        Connection con = Database.getConnection();
        Statement stmt = null;
        String query = "select * from DragonWars.Login where User = '" + User + "'";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String DPass = rs.getString("Pass");
            if (Pass.equals(DPass)) {
                suc = true;
            }
        }catch (SQLException e) {
            System.out.println("SQL Retrival Error");
        }finally {
          if (stmt != null) { stmt.close(); }
        }
        return suc;
    }  
}
