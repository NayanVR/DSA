import java.util.Arrays;

public class searchIn2D {
    public static void main(String[] args) {
        // matrix (n*n) should be sorted row and col wise
        int[][] matrix = { { 1, 3, 9 }, { 2, 5, 11 }, { 4, 6, 15 } };
        int target = 2;

        System.out.println(Arrays.toString(search(matrix, target)));
    }

    static int[] search(int[][] matrix, int target) {

        int row = 0;
        int col = matrix.length - 1;

        while (col >= 0 || row < matrix.length) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            }
            if (matrix[row][col] > target) {
                col--;
            }
            if (matrix[row][col] < target) {
                row++;
            }
        }

        return new int[] { -1, -1 };
    }
}
