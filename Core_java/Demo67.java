public class Demo67 {
    public static void main(String[] args) {
        int[] arr = {10, 15, 22, 37, 40, 55, 60}; 

        System.out.println("Even elements in the array:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}