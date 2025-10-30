package u3a1_debugfixifstmts;

import java.util.Scanner;

/**
 * @author omora
 *
 * Christian Alvarez
 * date: 10/25/2025
 *
 * psudocode:
 * fix the if statements so the program compiles
 *
 */

public class U3A1_DebugFixIFStmts {

    // TODO: fix the if statements so the program compiles 
    public static void main(String[] args) {
        
        System.out.println("Teacher's Copy");
	Scanner input = new Scanner(System.in);
        
        // prompt the user to enter 3 ints
        // and read them into
        // firstChoice
        // secondChoice
        // thirdChoice
        System.out.print("Enter three integers: ");
        int firstChoice = input.nextInt();
        int secondChoice = input.nextInt();
        int thirdChoice = input.nextInt();
    
        //Determine & print the state of choices made
        // fix: restructure the if-else statements to have correct inplamentation
        // fix: added checks for the variables to determine the number of choices made to the if statements
        if (firstChoice == 0 && secondChoice == 0 && thirdChoice == 0) {
            System.out.println("State of choices: \n" +
                    "no choices made yet");

        // fix: changed if into else if for better logic. else if statements to check conditions for secondChoice and thirdChoice correctly
	} else if (secondChoice == 0 && thirdChoice == 0) {
            System.out.println("State of choices: \n" +
                    "user made first choice (" + firstChoice + ")\n" +
                    "number of choices = 1");

        // fix: added else if statement to correctly check conditions
	} else if (thirdChoice == 0) {
            System.out.println("State of choices: \n" +
                    "user made first choice (" + firstChoice + ")\n" +
                    "user made second choice (" + secondChoice + ")\n" +
                    "number of choices = 2");

        // fix: moved print statement to else block to check all remaining cases and add semicolon to end of print statement
        } else {
            System.out.println("State of choices: \n" +
                    "user made first choice (" + firstChoice + ")\n" +
                    "user made second choice (" + secondChoice + ")\n" +
                    "user made third choice (" + thirdChoice + ")\n" +
                    "number of choices = 3");
	}
    }
    
}
