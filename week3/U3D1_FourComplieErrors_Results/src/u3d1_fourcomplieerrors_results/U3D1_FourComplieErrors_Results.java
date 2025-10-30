package u3d1_fourcomplieerrors_results; // fix: removed the extra "e" in the package name in "error"

import java.util.Scanner;


public class U3D1_FourComplieErrors_Results {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                // determine if integer is a multiple of 5
		// fix: added 
                if (number % 5 == 0) {
			System.out.println("Integer is a multiple of 5");
		}

                // determine if integer is an even
		// fix: replaced semicolon with opening and closing brackets
                if (number % 2 == 0) {
                        System.out.println("Integer is a multiple of 5"); 
		}

                // determine if number is neither
                if (number % 5 != 0 & 2 != 0) {
                        System.out.println("Integer is neither a multiple of 5 nor an even number");
                }

                // close scanner
                input.close();		
	}
	
}
