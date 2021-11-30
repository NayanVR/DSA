public class TransposeMatrix {
    public static void main(String[] args) {
        // https://leetcode.com/problems/transpose-matrix/

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        printMatrix(matrix);
        System.out.println();
        printMatrix(transpose(matrix));
    }

    static int[][] transpose(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int tMatrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tMatrix[i][j] = matrix[j][i];
            }
        }
        return tMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col : matrix[row]) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
