package sorting;

public class selectionsort {




   static int[] Selectionsort(int[] arr){
       int n = arr.length;
       for (int i = 0; i <=n-2; i++) {
           int min = i;
           for (int j = i+1 ; j <=n-1 ; j++) {
               if(arr[j]< arr[min]){
                   min = j ;
               }

           }
           swap(arr,i,min);
       }
       return arr;
   }












    static void  swap( int[] arr , int i , int min ){
        int temp = arr[i];
        arr[i]= arr[min];
        arr[min] = temp;
    }

    static void printarray( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,54,34,74,52,7,8,5,};


        printarray(arr);

        
        int[] sortedarray = Selectionsort(arr);
        printarray(arr);
    }
}
