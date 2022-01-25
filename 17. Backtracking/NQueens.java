public class NQueens {
    public static void main(String[] args) {

        int n = 6;
        boolean[][] board = new boolean[n][n];

        System.out.println(queens(board, 0));
    }

    // board == true means there is queen
    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        for (int col = 0; col < board.length; col++) {
            // if postion is safe then we can place queen and check for below rows
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                // while going back mark that place as false for future ways
                board[row][col] = false;
            }
        }

        return count;
    }

    static boolean isSafe(boolean[][] board, int row, int col) {

        // check rows that above placed queen
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // check for left side diagonal
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // check for right side diagonal
        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "Q " : "X ");
            }
            System.out.println();
        }
    }
}