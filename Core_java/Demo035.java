import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();
            
            if (firstNumber > secondNumber) {
                System.out.println(firstNumber + " is the larger number.");
            } else if (secondNumber > firstNumber) {
                System.out.println(secondNumber + " is the larger number.");
            } else {
                System.out.println("Both numbers are equal.");
            }
        }
    }
}