package u7a1_numofoccurrinsevenint;

import java.util.Scanner;


/**
 * @author christian
 *
 * This program will check the import of seven integers from the user.
 * It will then count the number of times each number occurs.
 * Output the number of occurrences of each number to the console
 *
 * pseudocode:
 * 1. declare an array to store user inputs
 * 2. get 7 numbers from the user
 * 3. process the input array to count how many times each unique number appears
 * 4. check for and store each individual number and its occurrences (i.e., 3 occurs 7 times)
 * 5. display the occurrences of each individual number to the console
 * 
 */

public class U7A1_NumOfOccurrInSevenInt {
    // declare an array to store user inputs
    public static int MAXNUBERS = 7;
    public static int[] USERNUMBERS = new int[MAXNUBERS];

    // count occurences of a number
    public static int occurenceOfNumber(int[] numbers, int numberToCheck) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToCheck) {
                count++;
            }
        }
        return count;
    }

    // parse array and format output
    public static String parser(int[] numbers) {
        String result = "";

        // declare an array to store checked numbers
        boolean[] checked = new boolean[MAXNUBERS];

        // loop through user numbers
        for(int i = 0; i < numbers.length; i++) {
            // skip if number was counted already
            if (checked[i]) {
                continue;
            }

            // get current number
            int currentNumber = numbers[i];

            // get occurences of current number
            int count = occurenceOfNumber(numbers, currentNumber);

            // add to result
            result += String.format("%d occurs %d times%n", currentNumber, count);

            // mark checked numbers
            for(int j = i; j < numbers.length; j++) {
                if(numbers[i] == numbers[j] && i != j) {
                    checked[j] = true;
                }
            }
        }

        // return result
        return result;
    }

	public static void main(String[] args) {

        // create scanner object
        Scanner scn = new Scanner(System.in);

        // prompt user for input
        System.out.print("Enter 7 integers: ");
        // use for loop to get user input
        for(int i = 0; i < MAXNUBERS; i++) {
            USERNUMBERS[i] = scn.nextInt();
        }

        // output result to console
        System.out.print(parser(USERNUMBERS));

        // close scanner object
        scn.close();

	}
	
}
