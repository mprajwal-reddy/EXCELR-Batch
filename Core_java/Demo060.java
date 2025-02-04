import java.util.Scanner;

public class Demo060 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Fibonacci Series:");
            generateFibonacci(n);
        }

        scanner.close();
    }

   
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;          
            second = next;            
        }
        System.out.println(); 
    }
}
