package homeworkweek8darshankalathiya;

/**
 * Write a programme to Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

import java.util.Scanner;

public class Programme_15_LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the left-angled triangle: ");
        int numRows = scanner.nextInt();

        printLeftAngleTriangle(numRows);

        scanner.close();
    }

    public static void printLeftAngleTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            // Print '*' for the current row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next line to start a new row.
            System.out.println();
        }
    }
}
