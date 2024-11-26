package array;
import java.util.Scanner;

public class Transpose_of_array {



    // Function to find the transpose of a matrix
    static int[][] findTranspose(int[][] matrix, int r, int c) {
        int[][] transpose = new int[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
    }

    // Function to display a matrix
    static void displayMatrix(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = scanner.nextInt();

        // Input the matrix elements
        int[][] matrix = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix, r, c);

        // Call the findTranspose function
        int[][] transpose = findTranspose(matrix, r, c);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        displayMatrix(transpose, c, r);

        scanner.close();
    }
}




