package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class plusone66copy {


        // Method to increment the large integer represented by the array
        static int[] increment(int[] digits) {
            int n = digits.length;

            // Start from the last element of the array
            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    // If the current digit is less than 9, simply increment it and return
                    digits[i]++;
                    return digits;  // when we return  digits here the whole process get stopped and nothing is runned after it
                }
                // If the current digit is 9, set it to 0 and continue to the next digit
                digits[i] = 0;
            }

            // If all digits were 9, create a new array with one more digit
            int[] newDigits = new int[n + 1];
            newDigits[0] = 1; // The first digit is 1
            // The rest of the digits are 0 by default, so no need to initialize them

            return newDigits;
        }

        public static void main(String[] args) {
            int[] digits = {1,2,9}; // Example input
            int[] result = increment(digits); // Increment the array

            // Print the resulting array

            System.out.println(Arrays.toString(result)); // Move to the next line after printing the array
        }










}
