package array;

import java.util.Arrays;

public class plusone66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) { // start from the last index
            // if it is nine make ir zero esle add 1
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;  // if last index < 9 add 1 and retun the array simply by return statement
                // use of reteun statement is to stopp the process and return value
            }
            digits[i] = 0;    // here last index is 9 so make it zero and move to further step
            // i.e is to create ne array will + 1 length
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        plusOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
