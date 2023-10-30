package homeworkweek8darshankalathiya;

import java.util.Scanner;

/**
 * Write a programme to Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 */

public class Programme_3_VowelOfConsonant {
    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet:  ");
        String input = scanner.next().toLowerCase(); // Convert to lowercase to handle uppercase and lowercase input.

        if (input.length() == 1 && input.matches("[a-z]")) {
            char letter = input.charAt(0);
            if (isVowel(letter)){
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Not a valid alphabet character.");
        }
    }

    public static boolean isVowel(char letter){
        return "aeiou".contains(String.valueOf(letter));

    }

}
