package lecture59_remaining;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {

//        Accept the matrix
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] addition = addMatrix(matrix1, matrix2);
        printMatrix(addition);

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] tempOuter : matrix) {
            for (int tempInner : tempOuter) {
                System.out.print(tempInner + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] addition = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int col = 0; col < matrix1[0].length; col++) {
                addition[row][col] = matrix1[row][col] + matrix2[row][col];

            }
        }

        return addition;
    }

    private static int[][] acceptMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  Number of Rows in Array");
        int rows = scanner.nextInt();
        System.out.println("Enter  Number of Column in Array");
        int col = scanner.nextInt();
        System.out.println("Enter the elements : ");
        int[][] matrix = new int[rows][col];
        for (int outer = 0; outer < rows; outer++) {
            for (int inner = 0; inner < col; inner++) {
                matrix[outer][inner] = scanner.nextInt();
            }
        }

        return matrix;
    }
}
