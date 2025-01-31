import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        char ch;
        
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Enter an uppercase character: ");
            ch = scanner.next().charAt(0);
            
        }

        
        if (Character.isUpperCase(ch)) {
            
            char lowerCh = Character.toLowerCase(ch);
            System.out.println("The lowercase character is: " + lowerCh);
        } else {
            System.out.println(ch + " is not an uppercase character.");
        }
    }
}