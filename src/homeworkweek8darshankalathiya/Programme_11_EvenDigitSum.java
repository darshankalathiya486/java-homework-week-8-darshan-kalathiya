package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * 1. We use a Scanner to input an integer from the user.
 * 2. The getEvenDigitSum method checks if the number is negative, and if it is, it returns -1 to indicate an invalid value.
 * 3. The method then uses a while loop to iterate through the digits of the number.
 * 4. It extracts the last digit of the number using the modulo operator (%).
 * 5. If the digit is even (i.e., its remainder when divided by 2 is 0), it is added to the evenSum.
 * 6. The last digit is removed from the number by dividing it by 10, preparing for the next iteration.
 * 7. The method returns the evenSum, which contains the sum of even digits within the number.
 */

public class Programme_11_EvenDigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int evenSum = getEvenDigitSum(number);

        if (evenSum != -1) {
            System.out.println("Sum of even digits: " + evenSum);
        } else {
            System.out.println("Invalid input: Number is negative.");
        }

        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        // Check if the number is negative, and if so, return -1 to indicate an invalid value.
        if (number < 0) {
            return -1;
        }

        int evenSum = 0; // Initialize a variable to store the sum of even digits.

        // Use a while loop to process each digit of the number.
        while (number > 0) {
            int digit = number % 10; // Get the last digit of the number.

            // Check if the digit is even by dividing it by 2 and checking the remainder.
            if (digit % 2 == 0) {
                evenSum += digit; // Add the even digit to the evenSum.
            }

            number /= 10; // Remove the last digit from the number to process the next digit.
        }

        return evenSum; // Return the sum of even digits in the number.
    }

}
