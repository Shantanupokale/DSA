package sorting;

public class insertionsort {
    static void Insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;

            // insert arr[i] to right place in sorted array
            while (j > 0 && arr[j] < arr[j-1]) {

                // swap the two numbers
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }











    static void printarray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 54, 34, 74, 4, 4, 2, 7, 8, 5,};

        printarray(arr);

        Insertionsort(arr);
        printarray(arr);
    }


}
