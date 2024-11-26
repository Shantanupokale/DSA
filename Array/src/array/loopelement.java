package array;

import java.util.Arrays;

public class loopelement {
    static int[] rotatearray( int[] arr, int k ){
        int n = arr.length;
        k=k%n;
        int[] ans = new int[n];
        int j = 0 ;
        for (int i = n-k; i <n ; i++) {      // for i=loop to manage elenet from n-k to n
            ans[j]= arr[i];
            j++;

        }

        for (int i = 0; i < n-k; i++) {      // for loop to namahe remainng array which would be in same e=sequence
            j++;

        }
        return ans;
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6} ;
    int k = 4;
    int[] ans = rotatearray(arr,k);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ans));

    }
}
