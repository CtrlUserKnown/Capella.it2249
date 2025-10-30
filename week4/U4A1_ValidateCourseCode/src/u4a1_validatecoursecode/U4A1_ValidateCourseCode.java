package u4a1_validatecoursecode;

import java.util.Scanner;

/**
 * @author christian
 *
 * psudocode:
 * 1. prompt user to enter a course code
 * 2. read course code from user
 * 3. validate course code using the following rules:
 *    a. must be exactly 6 characters long
 *    b. first 2 characters must be letters
 *    c. last 4 characters must be digits
 * 4. if course code is valid, print "Valid course code"
 * 5. if course code is invalid, print "Invalid course code"
 *
 */

public class U4A1_ValidateCourseCode {

        // validation function
        // use String.format() to format messages
        public static String validateCode(String code) {
                // check if the string is null
                // fix: use isEmpty() method to check for empty string instead of "== null"
                if (code.isEmpty()) {
                        return "Course code is invalid: Cannot be null.";
                }

                // collect all validation messages
                StringBuilder error = new StringBuilder();
                boolean isVaid = true;

                // check length of the string
                if (code.length() != 6) {
                        return String.format("Course code '%s' is invalid: %nMust be exactly 6 characters long.", code);
                }

                // check string for invalid characters using for loop
                // return a message for each condition that is met or not met
                // each case checks a specific character in the string
                for (int i = 0; i < code.length(); i++) {
                        char c = code.charAt(i);
                        switch (i) {
                                // case 0 & 1 check if the first two characters are 'I'/'i' and 'T'/'t' respectively
                                // case 2, 3, 4, & 5 check if the last four characters are digits
                                case 0:
                                        if (c != 'I' && c != 'i') {
                                                error.append("First character must be 'I' or 'i'.");
                                                isVaid = false;
                                        }
                                        break;
                                case 1:
                                        if (c != 'T' && c != 't') {
                                                 error.append("Second character must be 'T' or 't'.");
                                                 isVaid = false;
                                        }
                                        break;
                                case 2:
                                        if (!Character.isDigit(c)) {
                                                error.append("Third character must be a digit (0-9).");
                                                isVaid = false;
                                        }
                                        break;
                                case 3:
                                        if (!Character.isDigit(c)) {
                                                error.append("Fourth character must be a digit (0-9).");
                                                isVaid = false;
                                        }
                                        break;
                                case 4:
                                        if (!Character.isDigit(c)) {
                                                error.append("Fifth character must be a digit (0-9).");
                                                isVaid = false;
                                        }
                                        break;
                                case 5:
                                        if (!Character.isDigit(c)) {
                                                error.append("Sixth character must be a digit (0-9).");
                                                isVaid = false;
                                        }
                                        break;
                        }
                {}}

                // returns a message based on validation result
                // error messages are appended to reuturned string
                if (isVaid) {
                        return String.format("Course code '%s' is valid.", code);
                } else {
                        return String.format("Course code '%s' is invalid: %n%s", code, error.toString().trim());
                }

        }

	public static void main(String[] args) {
                // create scanner instance
                Scanner scn = new Scanner(System.in);

                // prompt user enter a course code
                System.out.print("Enter a course code to validate(e.g. IT4782): ");
                String courseCode = scn.nextLine();

                // validate course code using validate function and print result
                String result = validateCode(courseCode);
                System.out.println(result);

                // close scanner
                scn.close();
	}
	
}
