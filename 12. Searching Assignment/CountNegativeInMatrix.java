public class CountNegativeInMatrix {
    public static void main(String[] args) {
        // https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

        // int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1,
        // -1, -2, -3 } };
        // int[][] grid = { { 3, 2 }, { 1, 0 } };
        // int[][] grid = { { 1, -1 }, { -1, -1 } };
        int[][] grid = { { 1 } };

        System.out.println(countNegatives(grid));
    }

    static int countNegatives(int[][] grid) {
        int count = 0;

        for (int[] row : grid) {
            // hence it is sorted in descending order. after <0 than only nagative number
            // will be in array remaining

            int ans = ceiling(row, 0);

            if (ans < row.length) {
                count += row.length - ans;
            }
        }

        return count;
    }

    // ceiling with some modification
    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // if (target > arr[end])
        // return -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target <= arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            }
        }

        return start;
    }
}
