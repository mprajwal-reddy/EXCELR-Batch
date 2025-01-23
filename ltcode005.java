// ltcode005.java

import java.util.HashMap;

public class ltcode005 {
    public static int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the number and its index
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numToIndex.containsKey(complement)) {
                // If it exists, return the indices
                return new int[] { numToIndex.get(complement), i };
            }
            
            // Otherwise, add the current number and its index to the map
            numToIndex.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array (though the problem guarantees one solution)
        return new int[] {};
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 1]

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Output: [1, 2]

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); // Output: [0, 1]
    }
}