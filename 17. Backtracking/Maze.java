public class Maze {
    public static void main(String[] args) {
        // System.out.println(noOfPaths(3, 3));
        // printPath("", 3, 3);

        boolean[][] board = {
                { true, true, true },
                { true, true, false },
                { true, true, true }
        };
        pathWithObstacles("", board, 0, 0);
    }

    static void pathWithObstacles(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if (r < maze.length - 1) {
            pathWithObstacles(p + 'D', maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            pathWithObstacles(p + 'R', maze, r, c + 1);
        }
    }

    static int noOfPaths(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = noOfPaths(r - 1, c);
        int right = noOfPaths(r, c - 1);

        return left + right;
    }

    static void printPath(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            printPath(p + 'D', r - 1, c);
        }
        if (c > 1) {
            printPath(p + 'R', r, c - 1);
        }
    }
}