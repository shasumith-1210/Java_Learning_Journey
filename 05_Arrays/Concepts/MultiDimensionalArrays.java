/**
 * MULTIDIMENSIONAL ARRAYS 
 *
 * A multidimensional array is an array of arrays.
 *
 * The most commonly used multidimensional array is a two-dimensional (2D) array, which represents data in the
 * form of rows and columns.
 *
 * Syntax: dataType[][] arrayName;
 *
 * Example:
 * int[][] matrix = {
 *     {1, 2, 3},
 *     {4, 5, 6},
 *     {7, 8, 9}
 * };
 *
 * Accessing Elements:  matrix[row][column]
 * Example: matrix[1][2]  // 6
 */

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matrix:");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Element at row 2, column 3 : " + matrix[1][2]);

    }
}