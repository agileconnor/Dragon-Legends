/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GameFiles;
import Database.Database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Connor
 */
public class Data {
    public static int getTroopCount(String Name) throws SQLException {
        int Count = 0;
        Connection con = Database.getConnection();
        Statement stmt = null;
        String query = "select * from DragonWars.NationInfo where Name = '" + Name + "'";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Count = rs.getInt("TroopCount");
        }catch (SQLException e) {
            System.out.println("Retrival Error!");
            System.out.println("SQL Error: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally{
            if (stmt != null) { stmt.close(); }
        }
        return Count;
    }
    public static int getCivilCount(String Nation) throws SQLException {
        int Count = 0;
        Connection con = Database.getConnection();
        Statement stmt = null;
        String query = "select * from DragonWars.NationInfo where Name = '" + Nation + "'";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Count = rs.getInt("CivilCount");
        }catch (SQLException e) {
            System.out.println("Retrival Error!");
            System.out.println("SQL Error: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally{
            if (stmt != null) { stmt.close(); }
        }
        return Count;
    }
    public static String getAllies(String Nation) throws SQLException {
        String Allies = null;
        Connection con = Database.getConnection();
        Statement stmt = null;
        String query = "select * from DragonWars.NationInfo where Name = '" + Nation + "'";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Allies = rs.getString("Allies");
        }catch (SQLException e) {
            System.out.println("Retrival Error!");
            System.out.println("SQL Error: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally{
            if (stmt != null) { stmt.close(); }
        }
        return Allies;
    }
    public static String getEnemies(String Nation) throws SQLException {
        String Enemies = null;
        Connection con = Database.getConnection();
        Statement stmt = null;
        String query = "select * from DragonWars.NationInfo where Name = '" + Nation + "'";
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Enemies = rs.getString("Enemies");
        }catch (SQLException e) {
            System.out.println("Retrival Error!");
            System.out.println("SQL Error: " + e.getMessage());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }finally{
            if (stmt != null) { stmt.close(); }
        }
        return Enemies;
    }
}
