import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
        char ch;
       
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter a character: ");
            ch = scanner.next().charAt(0);
   
        }

        // Check if the character is uppercase or lowercase
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not a letter.");
        }
    }
}