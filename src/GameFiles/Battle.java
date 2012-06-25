/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GameFiles;
import Input.UserInput;
import java.sql.SQLException;
/**
 *
 * @author Connor
 */
public class Battle {
    public static String Simulator(String Nation , String Enemy) throws SQLException{
        Float troopNum, Luck, ELuck, TeTroops, EtroopNum ;
        int TETroops = Data.getTroopCount(Enemy);
        System.out.print("Enter Amount of Troops: ");
        String troops = UserInput.get();
        troopNum = Float.parseFloat(troops);
        int MinTroops = (int)(troopNum / 2);
        EtroopNum = Randomizer.RandomInteger(MinTroops, TETroops);
        System.out.println(Enemy + " is fielding" + EtroopNum + " troops");
        System.out.print("Do you want more troops? ");
        String choice = UserInput.get();
        if ("Yes".equals(choice) || "yes".equals(choice)) {
            System.out.print("Troop Amount: ");
            String a = UserInput.get();
            float aTroops = Float.parseFloat(a);
            troopNum = troopNum + aTroops; 
        }
        Luck = Randomizer.RandomInteger(1, 4);
        ELuck = Randomizer.RandomInteger(1, 4);
        TeTroops = troopNum * TechLevel;
        
    }
  
}
