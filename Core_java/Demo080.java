public class Demo080 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int firstElement = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = firstElement;

        System.out.println("Array after shifting elements to the left:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}