import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        char ch;
        // Prompt the user to enter a character
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a character
            System.out.print("Enter a character: ");
            ch = scanner.next().charAt(0);
            // Close the scanner
        }

        // Check if the character is uppercase, lowercase, digit, or special character
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }
    }
}