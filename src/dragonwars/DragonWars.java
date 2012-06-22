/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dragonwars;
import Login.Login;
import java.sql.SQLException;
/**
 *
 * @author Connor
 */
public class DragonWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        System.out.println("Dragon Wars v .02 Loaded");
        System.out.println("Please Login: ");
        Boolean LoginSuc = Login.LoginStart();
        if (LoginSuc == true) {
            System.out.println("Login Succesful");
        }else{
            System.out.println("Login Failed");
        }
    }
}
