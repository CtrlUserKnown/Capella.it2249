package echouser;

import java.util.Scanner;
/**
 * @author christian
 * 
 * Description:
 * This program will find out how many letter are in the users name.
 * 
 * Psudo Code: 
 * 1. Initialize Scanner for console input
 * 2. Display welcome message explaining the program's purpose
 * 3. Prompt user for first name and capture input
 * 4. Prompt user for last name and capture input
 * 5. Concatenate firstName + " " + lastName → fullName
 * 6. Echo back a personalized greeting with the full name
 * 7. Calculate name length (subtract 1 to exclude the space)
 * 8. Display the letter count to the user
 * 9. Close Scanner to free resources
 *
 */
public class EchoUser {

	public static void main(String[] args) {
                // start

                // create scanner instance
                Scanner scn = new Scanner(System.in);

                // greet the user
                System.out.println("Welcome to the user! \nFind out how many letter are in your name!");

                // get user first name input
                System.out.print("What is your first name? : ");
                String firstName = scn.nextLine();

                // get user last name input
                System.out.print("What is your last name? : ");
                String lastName = scn.nextLine();

                // add user first and last name
                String fullName = firstName + " " + lastName;

                // output name
                System.out.printf("Hello, %s! How are you?%n", fullName);

                // output name lenth
                // length -1 to account for the space in between the first and last name
                System.out.printf("Your name is %s long!%n", (fullName.length() - 1));

                // close scanner instance
                scn.close();

                // end
	}
	
}
