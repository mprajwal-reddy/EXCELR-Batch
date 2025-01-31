import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        int num4;
        // Prompt the user to enter four numbers
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter four numbers
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();
            System.out.print("Enter the third number: ");
            num3 = scanner.nextInt();
            System.out.print("Enter the fourth number: ");
            num4 = scanner.nextInt();
           
        }

        
        int largest = num1; 
        if (num2 > largest) {
            largest = num2; 
        }
        if (num3 > largest) {
            largest = num3; 
        }
        if (num4 > largest) {
            largest = num4; 
        }

        
        System.out.println("The largest number among the four is: " + largest);
    }
}