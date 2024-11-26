package array;

public class twopointer {


    static void SortZeroandOne (int[] arr){
        int n= arr.length;
        int left = 0 , right = n-1;
        while(right>left){
            if(arr[left] == 1 && arr[right] == 0 ){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        printarray(arr);
    }

//     static  void evenodd(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i] % 2 == 0 ){
//
//
//         }
//    }


    static void sortbyparity(int[]arr) {
        int n = arr.length;
        int left = 0, right = n - 1;

        while (right > left) {
            if ((arr[left] % 2) == 1 && (arr[right] % 2) == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if ((arr[left] % 2) == 0) {
                left++;
            }
            if ((arr[right] % 2) == 1) {
                right--;
            }
        }
        printarray(arr);
    }













    static void  swap( int[] arr , int i , int j ){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }

    static void printarray( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }






    public static void main(String[] args) {
       // int[] arr = {0,0,1,0,1,0,1,0,1,0,0,0,1,1,1,0,};   for sort zero one its the input
       // int[] ans = reversearray(arr);
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        printarray(arr);
        sortbyparity(arr);
       // SortZeroandOne(arr);
//
    }
}
