package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class concatarray_1929 {
    public static int[] getConcatenation(int[] nums) {

        int result[] = new int[2*nums.length];

        for (int i = 0; i <nums.length; i++) {

            result[i] = nums[i]; // nums index will be same for result

            result[i+ nums.length] = nums[i]; // ex result[2] = nums[2] but now result[2 + nums.length= 4 ] = result[6] = nums[2]
            // this will result in [ a,_,_, a ,_ ,_ ]

        }
       return result;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,1};
        int[] results = getConcatenation(nums);

        System.out.println(Arrays.toString(results));
    }
}
