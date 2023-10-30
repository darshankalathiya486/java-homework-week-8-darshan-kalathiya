package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * 1.The main method prompts the user to enter a number and reads the input.
 * 2.We call the hasSharedDigit method to check if the two numbers have a shared digit.
 * 3.In the hasSharedDigit method, we first check if both numbers are within the specified range (10 to 99).
 * 4.We extract the units and tens digits from both numbers.
 * 5.We then check if any of the extracted digits match between the two numbers.
 * 6.If a shared digit is found, the method returns true, indicating there's a shared digit. Otherwise, it returns false.
 * 7.Back in the main method, we print the result based on whether the hasShared variable is true or false.
 */

public class Programme_13_SharedDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (between 10 and 99): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (between 10 and 99): ");
        int number2 = scanner.nextInt();

        boolean hasShared = hasSharedDigit(number1, number2);

        if (hasShared) {
            System.out.println("Both numbers have a shared digit.");
        } else {
            System.out.println("There is no shared digit between the numbers.");
        }

        scanner.close();
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        // Check if the numbers are within the range of 10 (inclusive) - 99 (inclusive).
        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        }

        int digit1;
        int digit2;

        // Extract each digit from the first number.
        digit1 = number1 % 10;
        int firstNumberTensPlace = number1 / 10;

        // Extract each digit from the second number.
        digit2 = number2 % 10;
        int secondNumberTensPlace = number2 / 10;

        // Check if any of the digits match.
        return (digit1 == digit2 || digit1 == secondNumberTensPlace || firstNumberTensPlace == digit2 || firstNumberTensPlace == secondNumberTensPlace);
    }
}
