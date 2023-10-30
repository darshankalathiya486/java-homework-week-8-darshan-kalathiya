package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * This method calculates the sum of the first and last digits of the given number.
 * If the number is negative, it returns -1 to indicate invalid input.
 * param number The input number to process.
 * return The sum of the first and last digits, or -1 for negative numbers.
 */

public class Programme_7_FirstAndLastDigitSum {
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:  ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumFirstAndLastDigit(number);

            if (result == -1) {
                System.out.println("Invalid input:  Number is negative. ");
            } else {
                System.out.println("Sum of first and last digits: " + result);
            }
        } else {
            System.out.println("Invalid input : Not a valid integer. ");
        }
        scanner.close();
    }

    public static int sumFirstAndLastDigit(int number) {
        // Check if the number is negative, and if so, return -1 to indicate an invalid value.
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;  // Calculate the last digit by taking the remainder when divided by 10.
        int firstDigit = 0;

        // Use a loop to find the first digit by repeatedly dividing by 10 until only one digit remains.
        while (number > 0) {
            firstDigit = number % 10;
            number /= 10;

        }
        return firstDigit + lastDigit;
    }
}
