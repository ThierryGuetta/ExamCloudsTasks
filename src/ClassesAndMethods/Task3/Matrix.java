package ClassesAndMethods.Task3;

import java.util.Arrays;

public class Matrix {
    private int strings;
    private int column;
    private int[][] matrix = new int[column][strings];

    public void setStrings(int strings) {
        this.strings = strings;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int[][] sumMatrix(int[][] x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] += x[i][j];
            }
        }
        return matrix;
    }

    public int[][] multiMatrixAndInt(int x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] *= x;
            }
        }
        return matrix;
    }

    public int[][] multiMatrixAndMatrix(int[][] x) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] *= x[i][j];
            }
        }
        return matrix;
    }

    public void showMatrix() {
        System.out.println(Arrays.deepToString(matrix));
    }
}
