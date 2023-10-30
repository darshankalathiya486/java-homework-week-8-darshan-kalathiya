package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * 1. The isPalindrome method takes an integer as input and stores the original number in originalNumber.
 * 2. Inside the method, it uses a while loop to reverse the number and store the reversed number in the reverse variable.
 * 3. The loop extracts the last digit of the number, adds it to the reverse variable, and removes the last digit from the original number in each iteration.
 * 4. Finally, it compares the originalNumber with the reverse. If they are equal, the method returns true, indicating that the number is a palindrome; otherwise, it returns false.
 */


public class Programme_5_PalindromeNumber {
    // Main method with Scanner

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:  ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (isPalindrome(number)) {
                System.out.println("It is a palindrome number. ");
            } else {
                System.out.println("It is not a palindrome number. ");
            }
        } else {
            System.out.println("Invalid input: Not a valid integer. ");
        }
        scanner.close();
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reverse;
        
    }
}
