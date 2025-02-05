public class ltcode006 {
    public static int removeDuplicates(int[] nums) {
        // Check if the array is empty
        if (nums.length == 0) {
            return 0;
        }

        // Initialize a pointer for the position of unique elements
        int uniqueIndex = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the last unique element
            if (nums[i] != nums[uniqueIndex - 1]) {
                // Assign the current element to the unique index position
                nums[uniqueIndex] = nums[i];
                // Move the unique index forward
                uniqueIndex++;
            }
        }

        // Return the length of the array with unique elements
        return uniqueIndex;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {1, 1, 2}; // Example input
        int newLength = removeDuplicates(nums);
        
        // Print the result
        System.out.println("New length: " + newLength);
        System.out.print("Unique elements: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}