package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * Write a programme to right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme_8_RightAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop controls the number of rows.
        for (int i = 1; i <= rows; i++) {
            // Inner loop controls the number of "@" characters in each row.
            for (int j = 1; j <= i; j++) {
                System.out.print("@"); // Print an "@" character.
            }
            System.out.println(); // Move to the next line for the next row.
        }

        scanner.close();
    }
}
