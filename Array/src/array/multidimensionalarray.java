package array;
import java.util.Scanner;
public class multidimensionalarray {


    static void multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Invalid dimensions - multiplication not possible");
            return;
        }

        int[][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrices:");
        printMatrix(mul);
    }


    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int c1 = scanner.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Input for the second matrix
        System.out.print("Enter the number of rows for the second matrix: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int c2 = scanner.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Multiply matrices
        multiply(a, r1, c1, b, r2, c2);
    }

}

