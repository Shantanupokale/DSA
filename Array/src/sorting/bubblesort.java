package sorting;

public class bubblesort {


 static void Bubblesort(int[] arr ){
     int n = arr.length;
     for (int i = 0; i < n-1; i++) {

         for (int j = 0; j < n- i - 1; j++) {
             if(arr[j]> arr[j+1]){
                 int temp = arr[j];
                 arr[j]= arr[j+1];
                 arr[j+1] = temp ;
             }

         }

     }

 }




    static void printarray( int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,54,34,74,4,4,2,7,8,5,};

        printarray(arr);

        Bubblesort(arr);
        printarray(arr);
    }
}
