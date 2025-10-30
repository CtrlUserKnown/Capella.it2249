package isletterisdigitelse;

/**
 * @author christian
 *
 * psudocode:
 * 1. prompt user for a character input
 * 2. read character input
 * 3. if character is a letter or digit
 *
 */

import java.util.Scanner;

public class IsLetterIsDigitElse {

        // check if character is letter or digit
        public static void checkInput(char character) {
                // check if the character is a letter or digit using switch case statement
		// get the type of the charactor to check it 
                switch (Character.getType(character)) {
                        // check for uppercase and lowercase letters
                        case Character.UPPERCASE_LETTER:
                        case Character.LOWERCASE_LETTER:
                                System.out.println("You entered a letter.");
                                break;
                        case Character.DECIMAL_DIGIT_NUMBER:
                                System.out.println("You entered a digit.");
                                break;
                        default:
                                System.out.println("You entered neither a letter nor a digit.");
                                break;
                }
        }

	public static void main(String[] args) {
                // create scanner object
                Scanner scn = new Scanner(System.in);

                // prompt user for character input
                System.out.print("Enter a single character: ");
                char userCharacter =  scn.next().charAt(0);

                // call funtion to check if character is letter or digit
                checkInput(userCharacter);

                // close scanner
                scn.close();

	}

}
