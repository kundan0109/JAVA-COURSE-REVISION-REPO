package lecture59_remaining;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {

        int[][] matrix1 = getMatrix();
        int[][] matrix2 = getMatrix();
        int[][] addition = addMatrices(matrix1, matrix2);
        printAdditionMatrix(addition);

    }

    private static void printAdditionMatrix(int[][] addition) {
        for (int row = 0; row < addition.length; row++) {
            for (int column = 0; column < addition[0].length; column++) {
                System.out.print(addition[row][column] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] addition = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[0].length; column++) {
                addition[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return addition;
    }

    private static int[][] getMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of rows in Matrix ");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter Number of columns in Matrix");
        int numberOfColumns = scanner.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        System.out.println("Enter matrix elements : ");
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[rows][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

}
