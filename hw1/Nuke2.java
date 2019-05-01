/* Nuke2.class */
import java.io.*;
/** A class called Nuke2 whose main method reads a string from the keyboard 
 *  and prints the same string, with its second character removed.
 */

public class Nuke2 {
 /**
  *  @param arg is not used.
  *  @exception Exception thrown if there are any problems using the class
  *
  */

    public static void main(String[] args) throws Exception{
        System.out.print("Please input a string:");
        BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = keyboardReader.readLine();
		String outputString;
        outputString = inputString.substring(0,1) + inputString.substring(2);
        System.out.println(outputString);
    }
}
