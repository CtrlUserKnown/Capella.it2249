package echofiveintswarrays;

import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * @author christian
 *
 * Pseudocode:
 * 1. call Array to store integer data
 * 2. prompt user for five integers
 * 3. get user input & store in an Array
 * 4. echo to the user
 *
 */

public class EchoFiveIntsWArrays {
    // create program variables
    public static final int MAXNUMBER = 5;

    private static int[] getUserInput() {
        // create scanner & array to store user input
        Scanner scn = new Scanner(System.in);
        int[] numberStore = new int[MAXNUMBER];
        boolean validInput = false;

        // prompt user for five integers & store in array
        while (!validInput) {
            try {
                System.out.print("Please enter 5 integers: ");
                for(int i = 0; i < MAXNUMBER; i++) {
                    int input = scn.nextInt();
                    numberStore[i] = input;
                }
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter integers only.");
                scn.nextLine(); // Clear the invalid input
            }
        }

        scn.close();
        return numberStore;

    }

    private static void echoUser(int[] numbers) {
        // create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // format output
        sb.append("The 5 integers = ");
        for(int i = 0; i < numbers.length; i++) {
            // append number to StringBuilder
            sb.append(numbers[i]);

            if(i < numbers.length - 1) {
                sb.append(" ");
            }

        }

        // print output to console
        System.out.println(sb);
    }

    public static void main(String[] args) {
        // call echoUser method with user input
        echoUser(getUserInput());
    }
}

