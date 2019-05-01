/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
	/* Create a URL object */
	URL url = new URL("https://www." + inputLine + ".com");
	/* Create a BufferedReader, using InputStreamReader and URL object's openStream() method */
	BufferedReader readWebsite = new BufferedReader(new InputStreamReader(url.openStream()));
	/* Create a String Array which stored the first five lines of the Web page */
	int numOfLines = 5;
	String result[] = new String[numOfLines];
	String oneLine;
	int count = 0;
	int totalCount = 0;
	while (true) {
		totalCount++;
		oneLine = readWebsite.readLine();
		
		if (oneLine != null && count < numOfLines) { 
			result[count] = oneLine;
			count++;
			//System.out.println(count);
			//System.out.println(oneLine);
		}
		else if (count >= numOfLines) {
			break;
		}
		else {
			;//do nothing
		}
		
		if (totalCount > 200) {
			System.out.println("No More Lines Find!");
			break;
		}
		else {
			;//do nothing
		}
	}
	//while ((oneLine = readWebsite.readLine()) != null && count < numOfLines) {
	//	result[count] = oneLine;
	//	count++;
	//}

	//for (int i = 4; i >= 0; --i) {
	//	result[i] = readWebsite.readLine();
	//}
	//
	// Out Pu
	for (int i = numOfLines; i > 0; --i) {
		System.out.println(result[i-1]);
	}
  }
}
