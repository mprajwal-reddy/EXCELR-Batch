public class Problemstatement002 {

    public static int[] fibonacciSequence(int terms) {
        if (terms <= 0) {
            return new int[0];
        }
        
        int[] sequence = new int[terms];
        sequence[0] = 0;
        
        if (terms > 1) {
            sequence[1] = 1;
            for (int i = 2; i < terms; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        }
        
        return sequence;
    }

    public static void main(String[] args) {
        int terms = 10; // Example: Get first 10 terms of Fibonacci sequence
        int[] fibonacci = fibonacciSequence(terms);
        
        for (int num : fibonacci) {
            System.out.print(num + " ");
        }
    }
}