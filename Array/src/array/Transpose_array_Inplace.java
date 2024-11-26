package array;
import java.util.Scanner;

public class Transpose_array_Inplace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        // Input the matrix elements
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix, n, n);

        // Perform in-place transpose
        inPlaceTranspose(matrix, n);

        // Print the transposed matrix
        System.out.println("Transposed Matrix (In-place):");
        displayMatrix(matrix, n, n);

        scanner.close();
    }

    // Function to perform in-place transpose
    static void inPlaceTranspose(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }

    // Function to swap elements in the matrix
    static void swap(int[][] matrix, int i, int j, int x, int y) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
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
}
