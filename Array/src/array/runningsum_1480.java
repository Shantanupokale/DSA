package array;

import java.util.Arrays;

public class runningsum_1480 {

    public static int[] runningSum(int[] nums) {

//        int[] arr = new int[nums.length];
        int[] result = new int[nums.length];
          result[0]= nums[0];
        for (int i = 1; i < nums.length; i++) {

            result[i]=nums[i];
            result[i] = result[i-1]+nums[i];


        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int[] results = runningSum(nums);

        System.out.println(Arrays.toString(results));
    }

}
