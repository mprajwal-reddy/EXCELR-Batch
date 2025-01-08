import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int nextMultiple = getNextMultipleOf100(number);
            System.out.println("Next multiple of 100 after " + number + " is: " + nextMultiple);
        }
    }

    public static int getNextMultipleOf100(int number) {
        return ((number / 100) + 1) * 100;
    }
}