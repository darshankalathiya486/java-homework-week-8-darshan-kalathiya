package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * 1.The main method prompts the user to enter a number and reads the input.
 * 2.We call the isPrimeNumber method to check if the entered number is prime.
 * 3.In the isPrimeNumber method, we first check if the number is less than 2. If it's less than 2, it's not prime.
 * 4.Then, we iterate through numbers from 2 up to the square root of the input number and check for factors.
 * If we find any factors, the number is not prime.
 * 5.If no factors are found, the number is prime.
 * 6.Back in the main method, we print the result based on whether the isPrime variable is true or false.
 */

public class Programme_12_PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrimeNumber(int number) {
        // Check if the number is less than 2 (not prime).
        if (number < 2) {
            return false;
        }

        // Check for factors of the number.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a factor, not prime.
            }
        }

        return true; // Number is prime.
    }
}
