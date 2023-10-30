package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * Write programme to  the sumDigits method checks if the input is a non-negative number with more than one digit.
 * If it meets these criteria, it calculates the sum of its digits by repeatedly using modulo (%) to extract
 * the least-significant digit and then discarding it using integer division (/).
 */

public class Programme_4_DigitSumChallenge {
    // Main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int result = sumDigits(number);

            if (result == -1) {
                System.out.println("Invalid input: Number is less than 10 or negative. ");
            } else {
                System.out.println("Sum of digits: " + result);
            }
        } else {
            System.out.println("Invalid input: Not a valid integer.");
        }
        scanner.close();
    }

    // static sumDigits
    public static int sumDigits(int number) {
        if (number < 10 || number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;

    }
}
