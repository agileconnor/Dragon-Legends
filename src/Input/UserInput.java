/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Connor
 */
public class UserInput {
    /**
     * Simple Code for retrieving user input from the command prompt. 
     * Returns: String
     * @return
     */
    public static String get() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;
        try {
            input = br.readLine();
        }catch(IOException e) {
            System.out.println("Input Error!");
            System.exit(1);
        }
        return input; 
    }
}
