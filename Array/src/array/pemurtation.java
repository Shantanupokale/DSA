package array;

import java.util.Arrays;

public class pemurtation {

        // Function to build a new array based on the given array
        public static int[] buildArray(int[] nums) {
            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                result[i] = nums[nums[i]];
            }
            return result; // Return the result array
        }

        public static void main(String[] args) {
            // Example array with valid indices
            int[] nums = {0, 2, 1, 3};  // Ensure values are within the correct range
            int[] results = buildArray(nums);

            System.out.println(Arrays.toString(results));
    }
}
