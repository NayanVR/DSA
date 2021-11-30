public class diagonalSum {
    public static void main(String[] args) {

        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.println(diagonalSum(mat));
    }

    static int diagonalSum(int[][] mat) {

        int sum = 0;

        // i --> represents row
        // j --> col from start
        // k --> col from end
        for (int i = 0, j = 0, k = mat.length - 1; i < mat.length; i++, j++, k--) {
            sum += (j != k) ? mat[i][j] + mat[i][k] : mat[i][j];
        }
        return sum;
    }
}
