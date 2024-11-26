package array;

import java.util.Arrays;

public class Reversearray {


//    static int[] reversearray(int[] arr){
//        int n = arr.length;
//        int[] arr2 = new int[n];
//        int j = 0 ;
//
//        for (int i = n-1; i >= 0  ; i--) {
//            arr2[j]=arr[i];
//            j++;
//
//        }
//        return arr2;
//    }

    // this above code is more complex and needs to cretate new array

    static void  swap( int[] arr , int i , int j ){
       int temp = arr[i];
       arr[i]= arr[j];
       arr[j] = temp;
    }


    static void reversearray2(int[] arr){    //swap in inplace
        int i = 0 ,j = arr.length -1 ;
        while(i<j){
            swap(arr, i,j);
            i++;
            j--;
        }

    }



    static void printarray( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }








    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
      // int[] ans = reversearray(arr);
        printarray(arr);
     //   printarray(ans);
       reversearray2(arr);
        System.out.println("");
        printarray(arr);
    }
}
