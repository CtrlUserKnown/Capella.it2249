// @author: Christian Alvarez
package hellouser;

import java.util.Scanner;

/**
 * HelloUser - A simple Java application that prompts for user input
 * and displays a personalized greeting.
 * 
 * @author Christian Alvarez
 */
public class HelloUser {

	public static void main(String[] args) {
                // create scanner instance
		Scanner scn = new Scanner(System.in);
                
                // prompt user for there name
                System.out.println("Hello, please enter your name: ");
                // get the user input and store in 'name' variable
                String name = scn.nextLine();

                // output the name of the user within the string
		// use printf() instead for println() to make output concisec
                System.out.printf("Hello %s, it is nice to meet you! %n", name);

                // terminate the scanner instance
                scn.close();
	}
	
}
