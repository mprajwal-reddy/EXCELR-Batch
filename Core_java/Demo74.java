public class Demo74 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1};
        
    
        System.out.println("Array before sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Array after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}