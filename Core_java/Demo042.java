import java.util.Scanner;

public class Demo042 {
    public static void main(String[] args) {
        char ch;
        // Prompt the user to enter a lowercase character
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a lowercase character
            System.out.print("Enter a lowercase character: ");
            ch = scanner.next().charAt(0);
            // Close the scanner
        }

        // Check if the character is lowercase
        if (Character.isLowerCase(ch)) {
            // Convert to uppercase
            char upperCh = Character.toUpperCase(ch);
            System.out.println("The uppercase character is: " + upperCh);
        } else {
            System.out.println(ch + " is not a lowercase character.");
        }
    }
}