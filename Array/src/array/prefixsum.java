package array;

import java.util.Arrays;

public class prefixsum {

    static int[] makeprefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];
            }
        return pref;
    }

    static int[] makeprefixSumArray2(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }


    static void printarray( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printarray(arr);
       int[] pref = makeprefixSumArray(arr);
      printarray(pref);
       int[] var = makeprefixSumArray2(arr);
      printarray(var);
    }
}
