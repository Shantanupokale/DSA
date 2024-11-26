package sorting;
//sort teh array accordinly so that all zeros should be at end and
// all else should be at at the order its provided
//input int[] arr = {0,5,0,3,4,2};
//           output {5,3,4,2,0,0}






public class bubblesortquestion {

   static void bubble(int[] arr){
       int n = arr.length;
       for (int i = 0; i <n-1; i++) {

           for (int j = 0; j < n-i-1 ; j++) {
               if(arr[j] == 0 & arr[j + 1]!=0 ){
                   int temp = arr[j];
                   arr[j]= arr[j+1];
                   arr[j+1] = temp;


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
        int[] arr = {0,5,0,3,4,2};

        printarray(arr);

         bubble(arr);
        printarray(arr);
    }
}
