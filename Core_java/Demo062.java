public class Demo062 {
    public static void main(String[] args) {
        // Array of sample elements
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        // Elements to find the index of
        int[] elements = {20, 50, 70};

        // Loop through the elements array and find their index values
        for (int element : elements) {
            // Initialize the index value to -1 (not found)
            int index = -1;
            // Loop through the numbers array to find the index of the element
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == element) {
                    index = i;
                    break;
                }
            }

            // Display the index value
            if (index != -1) {
                System.out.println("The index of element " + element + " is: " + index);
            } else {
                System.out.println("Element " + element + " not found in the array.");
            }
        }
    }
}