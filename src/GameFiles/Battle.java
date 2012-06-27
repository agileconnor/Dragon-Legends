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
        int TAva = Data.getTroopCount(Nation);
        System.out.print("Enter Amount of Troops: ");
        String troops = UserInput.get();
        troopNum = Float.parseFloat(troops);
        if (troopNum > TAva) {
            System.out.println("Not Enough Troops Available");
            System.out.println("Using All Available Troops!");
            troopNum = (float) TAva;
        }
        int MinTroops = (int)(troopNum / 2);
        EtroopNum = Randomizer.RandomInteger(MinTroops, TETroops);
        System.out.println(Enemy + " is fielding" + EtroopNum + " troops");
        System.out.print("Do you want backup? ");
        String choice = UserInput.get();
        if ("Yes".equals(choice) || "yes".equals(choice)) {
            System.out.print("Troop Amount: ");
            String a = UserInput.get();
            float aTroops = Float.parseFloat(a);
            if (aTroops > TAva - troopNum) {
                System.out.println("You don't have enough troops!");
                System.out.println("Would you like to call in an ally?");
                System.out.print("Yes/No: ");
                a = UserInput.get();
                if ("Yes".equals(a) || "yes".equals(a)) {
                    System.out.println("Available Allies: ");
                    System.out.println(Data.getAllies(Nation));
                }
            }
            troopNum = troopNum + aTroops;
            
        }
        Luck = Randomizer.RandomInteger(1, 4);
        ELuck = Randomizer.RandomInteger(1, 4);
        TeTroops = troopNum * TechLevel;
        
    }
  
}
