package u5a1_findhighlowfiveints;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author christian
 * 
 * Psuedocode:
 * 1. prompt user to enter five integers
 * 2. read in five integers
 * 3. determine the highest and lowest integers
 * 4. display the highest and lowest integers
 */
public class U5A1_FindHighLowFiveInts {

	public static void main(String[] args) {
                // create scanner object
                Scanner scn = new Scanner(System.in);

                try {

                    // prompt user to enter five integers
                    System.out.print("Enter five integers: ");

                    // read the first integer and initialize high and low
                    int number = scn.nextInt();
                    int highest = number;
                    int lowest = number;

                    // use for loop to read the next four integers
                    // and determine highest and lowest
                    for (int i = 1; i < 5; i++) {
                        number = scn.nextInt();

                        // deterimine is the highest and update high
                        if (number > highest) {
                            highest = number;
                        }

                        // deterimine is the lowest
                        if (number < lowest) {
                            lowest = number;
                        }
                    }

                    // display the highest and lowest integers
                    System.out.printf("The highest integer is: %d%n", highest);
                    System.out.printf("The lowest integer is: %d%n", lowest);

                } catch (InputMismatchException e) {

                    System.out.println("Invalid input. Please enter integers only.");
		
                } finally {

                    // close scanner
                    scn.close();

                }

	}
	
}
