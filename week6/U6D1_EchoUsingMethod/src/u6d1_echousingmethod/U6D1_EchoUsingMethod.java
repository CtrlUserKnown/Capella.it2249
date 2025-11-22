package u6d1_echousingmethod;

import java.util.Scanner;

/**
 * @author christian
 * 
 * pscodecode:
 * 1. make methods to echo the uses input
 * 2. call in the methods in main
 * 3. use one method to get the user input and return it
 * 4. use another method to print a message asking for user input
 */
public class U6D1_EchoUsingMethod {

    // method to get user input
    public static String getInput() {
        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user for input
        System.out.print("Please enter a message: ");

        // get user input
        String userInput = input.nextLine();

        // return user input
        return userInput;
    }

    // method to output the user input
    public static void toOutput(String message) {
        System.out.println("You entered: " + message);
    }

	public static void main(String[] args) {
        // call the methods from within main
        toOutput(getInput());
    }

}

