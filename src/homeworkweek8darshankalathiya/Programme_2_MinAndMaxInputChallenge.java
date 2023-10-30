package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * Write a programme to Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * Use an endless while loop.
 */

public class Programme_2_MinAndMaxInputChallenge {
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE; // Initialize min with the maximum possible integer value
        int max = Integer.MIN_VALUE; // Initialize max with the minimum possible integer value

        // while loop
        while (true) {
            System.out.println("Enter number:  ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }
            } else {
                break; // Exit the loop if an invalid input is entered
            }

            // Consume the newline character left in the buffer
            scanner.nextLine();

        }

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE) {
            System.out.println("No valid number were entered.");
        } else {
            System.out.println("Minimum number entered:  " + min);
            System.out.println("Maximum number entered:  " + max);
        }

        scanner.close(); // Close the scanner when done.


    }
}
