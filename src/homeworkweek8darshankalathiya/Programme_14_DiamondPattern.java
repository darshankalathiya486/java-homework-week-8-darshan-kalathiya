package homeworkweek8darshankalathiya;

/**
 * Write a programme to display the pattern like a diamond.
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 */

import java.util.Scanner;

public class Programme_14_DiamondPattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the diamond: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number for the size of the diamond.");
        } else {
            printDiamondPattern(n);
        }

        scanner.close();
    }

    public static void printDiamondPattern(int size) {
        int space = size / 2;
        int stars = 1;

        for (int i = 1; i <= size; i++) {
            // Print leading spaces.
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Print stars.
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            // Move to the next line.
            System.out.println();

            if (i < size / 2 + 1) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
        }
    }
}
