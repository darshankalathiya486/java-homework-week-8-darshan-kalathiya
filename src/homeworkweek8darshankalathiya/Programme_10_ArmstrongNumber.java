package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * Write programme to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number from the user.

        int originalNumber = number; // Store the original number for comparison.
        int result = 0;

        // Calculate the sum of the cubes of its digits.
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, 3); // Cube the digit and add to the result.
            number /= 10;
        }

        // Check if the result is equal to the original number.
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }


}
