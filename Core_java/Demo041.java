import java.util.Scanner;

public class Demo041 {
    public static void main(String[] args) {
        char ch;
        // Prompt the user to enter a character
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter a character
            System.out.print("Enter a character: ");
            ch = scanner.next().charAt(0);
            // Close the scanner
        }

        // Convert character to lowercase for easier comparison
        char lowerCh = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (lowerCh >= 'a' && lowerCh <= 'z') { // Check if it's a letter
            if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}