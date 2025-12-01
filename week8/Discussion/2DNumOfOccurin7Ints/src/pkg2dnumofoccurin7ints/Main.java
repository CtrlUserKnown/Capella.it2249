package pkg2dnumofoccurin7ints;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * @author christian
 * 
 * psuedo code:
 * 1. create a 2D array of Integer
 * 2. use a method that handles counting the array
 * 3. return the results to main method
 * 4. output the results using the format: "Number X occurs Y times"
 *
 */

public class Main {
    // method to count occurrences of integers in 2d array
    public static Map<Integer, Integer> countOccurrences(Integer[][] array) {
        // count occurrences using a HashMap
        Map<Integer, Integer> count = new HashMap<>();

        for(Integer[] row : array) {
            for(Integer num : row) {
                if(num != null) {
                    count.put(num, count.getOrDefault(num, 0) + 1); // skip null values
                }
            }
        }

        // return the results
        return count;
    }

	// @main method
	public static void main(String[] args) {
        // create Scanner object
        Scanner scn = new Scanner(System.in);

        // create 2d array
        Integer[][] array = new Integer[2][4];

        // populate the array with 7 integers
        int count = 0;
        boolean validInput = false;

        while(!validInput) {
            try {
                System.out.print("Enter 7 integers: ");

                count = 0;
                // only take 7 inputs
                for(int i = 0; i < array.length && count < 7; i++) {
                    for(int j = 0; j < array[i].length && count < 7; j++) { 
                        array[i][j] = scn.nextInt();
                        count++;
                    }
                }
                validInput = true; // all inputs were valid
            } catch(InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                // clear the entire line
                scn.nextLine(); 
                array = new Integer[2][4]; // reset the array
            }
        }

        // count occurrences
        Map<Integer, Integer> occurrences = countOccurrences(array);

        // display occurrences
        System.out.println("Occurrence count:");
        for(Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }

        scn.close();
	}
}
