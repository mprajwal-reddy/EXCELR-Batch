import java.util.Scanner;

public class Demo036 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int firstNumber = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int secondNumber = scanner.nextInt();
            
            System.out.print("Enter the third number: ");
            int thirdNumber = scanner.nextInt();
            
            int largestNumber = firstNumber; 
            if (secondNumber > largestNumber) {
                largestNumber = secondNumber; 
            }
            
            if (thirdNumber > largestNumber) {
                largestNumber = thirdNumber; 
            }
            
            System.out.println("The largest number is: " + largestNumber);
        }
    }
}