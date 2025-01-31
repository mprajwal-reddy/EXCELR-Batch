import java.util.Scanner;

public class Demo044 {
    public static void main(String[] args) {
        int num1;
        int num2;
        
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();
            
        }

       
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        
        int temp = num1; 
        num1 = num2;     
        num2 = temp;   

        
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}