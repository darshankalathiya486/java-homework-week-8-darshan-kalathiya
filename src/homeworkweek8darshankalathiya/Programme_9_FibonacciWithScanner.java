package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * Write programme to Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to generate: ");
        int n = scanner.nextInt(); // Read the number of terms from the user.

        int first = 1; // Initialize the first term of the sequence.
        int second = 1; // Initialize the second term of the sequence.

        System.out.print("Fibonacci Sequence: ");

        // Print the first two terms as they are always 1.
        System.out.print(first + " " + second + " ");

        // Use a loop to calculate and print the remaining terms of the sequence.
        for (int i = 2; i < n; i++) {
            int next = first + second; // Calculate the next term.
            System.out.print(next + " "); // Print the next term.

            // Update first and second for the next iteration.
            first = second;
            second = next;
        }

        scanner.close();
    }
}
