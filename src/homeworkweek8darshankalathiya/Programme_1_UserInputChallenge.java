package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * Write a programme to Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * Use the nextInt() method to get the number and add it to the sum.
 * Use a while loop.
 * Use a counter variable for counting valid numbers
 */

public class Programme_1_UserInputChallenge {
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        // While loop
        while (count < 10) {
            System.out.println("Enter number #" + (count + 1) + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            // Consume the newline character left in the buffer
            scanner.nextLine();
        }

        System.out.println("Sum of the 10 valid nu,ber is:  " + sum);

    }
}
