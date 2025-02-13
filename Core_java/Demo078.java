public class Demo078 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = new int[arr.length];
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[leftIndex++] = arr[i];
            } else {
                result[rightIndex--] = arr[i];
            }
        }

        System.out.println("Array with even numbers on the left and odd numbers on the right:");
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}