public class AllPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };
        int[][] path = new int[board.length][board[0].length];
        // findAllPaths("", board, 0, 0);
        printAllPaths("", board, 0, 0, path, 1);
    }

    static void findAllPaths(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        // considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            findAllPaths(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            findAllPaths(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            findAllPaths(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            findAllPaths(p + 'L', maze, r, c - 1);
        }

        // while going back mark it as true for future paths
        maze[r][c] = true;
    }

    static void printAllPaths(String p, boolean[][] maze, int r, int c, int[][] path, int steps) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = steps;
            pritnMatrix(path);
            System.out.println();
            return;
        }
        if (!maze[r][c]) {
            return;
        }

        // considering this block in my path
        maze[r][c] = false;
        path[r][c] = steps;

        if (r < maze.length - 1) {
            printAllPaths(p + 'D', maze, r + 1, c, path, steps + 1);
        }
        if (c < maze[0].length - 1) {
            printAllPaths(p + 'R', maze, r, c + 1, path, steps + 1);
        }
        if (r > 0) {
            printAllPaths(p + 'U', maze, r - 1, c, path, steps + 1);
        }
        if (c > 0) {
            printAllPaths(p + 'L', maze, r, c - 1, path, steps + 1);
        }

        // while going back mark it as true for future paths
        maze[r][c] = true;
        path[r][c] = 0;
    }

    static void pritnMatrix(int[][] path) {
        for (int[] row : path) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
