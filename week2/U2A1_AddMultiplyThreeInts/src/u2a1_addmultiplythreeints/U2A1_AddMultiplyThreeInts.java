package u2a1_addmultiplythreeints;
/**
 * @date 10/13/2025
 * @author Christian Alvarez
 * 
 * Adding and Multiplying integers 
 */

// import Scanner class
import java.util.Scanner;

public class U2A1_AddMultiplyThreeInts {

        // use a function to get the sum and product of the integers
        // adding function
        public static int intsSum(int int1, int int2, int int3) {
                // return the sum of the intagers
                return (int1 + int2) + int3;
        }

        // multipling function
        public static int intsProduct(int int1, int int2, int int3) {
                // return the product of the integers
                return (int1 * int2) * int3;
        }

	// 
	public static void main(String[] args) {
                // create scanner instance
                Scanner scn = new Scanner(System.in);

                // prompt use for the three integers
                System.out.print("Enter the frist integer: ");
                int userInt1 = scn.nextInt();

                System.out.print("Enter the second integer: ");
                int userInt2 = scn.nextInt();

                System.out.print("Enter the third integer: ");
                int userInt3 = scn.nextInt();

                // output product 
                System.out.printf("The sum of three integers = %d%n", intsSum(userInt1, userInt2, userInt3));

                // output sum
                System.out.printf("The product of three integers = %d%n", intsProduct(userInt1, userInt2, userInt3));

	}
}
