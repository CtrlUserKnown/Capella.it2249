package addfiveints;

import java.util.Scanner;

/**
 * @author christian
 *
 * Psudocode: 
 * prompt user to enter five integers
 * read in integers
 * add the integers
 * display the sum of the five integers
 */
public class AddFiveInts {

	public static void main(String[] args) {
                // create scanner object
                Scanner scn = new Scanner(System.in);

                // prompt user to enter five integers
                System.out.print("Please enter five integers: ");

                // read integers using for loop and scanner object
                // will loop five times to read each integers
                int sum = 0;
                for (int i = 0; i < 5; i++) {
                    int finalNumber = scn.nextInt();
                    sum += finalNumber;
                }

                // display the sum of the five integers
                System.out.printf("The sum of the five integers is: %d%n", sum);

                // close scanner
                scn.close();
	}
	
}
