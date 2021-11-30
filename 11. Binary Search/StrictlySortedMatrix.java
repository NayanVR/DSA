import java.util.Arrays;
import java.util.EnumSet;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        // What is Strictly sorted matrix
        // let's take example:
        // {1,2,3}
        // {4,5,6}
        // {7,8,9}
        // In Strictly sorted matrix first element of particular row is greater than
        // last element of previous row (4 > 3, 7 > 6)

        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int target = 10;

        System.out.println(Arrays.toString(searchStrictMatrix(matrix, target)));
    }

    static int[] searchStrictMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length; // check if matrix is not null (matrix[0] throw err)

        if (rows == 1) {
            int col = searchWithBinary(matrix[0], target);
            return col != -1 ? new int[] { 0, col } : new int[] { -1, -1 };
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) {

            int mid = rStart + (rEnd - rStart) / 2;

            if (target > matrix[mid][cMid]) {
                rStart = mid;
            } else if (target < matrix[mid][cMid]) {
                rEnd = mid;
            } else {
                return new int[] { mid, cMid };
            }
        }

        // my rStart is equal to rEnd
        // now we have only 2 rows so we can apply BS
        if ((matrix[rStart][0] <= target) && (matrix[rStart][cols - 1] >= target)) {
            return new int[] { rStart, searchWithBinary(matrix[rStart], target) };
        } else {
            return new int[] { rEnd, searchWithBinary(matrix[rEnd], target) };
        }
    }

    static int searchWithBinary(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // int middle = (start + end) / 2;
            // for large ammount of array (start + end) may exceeds limit of int in java

            int middle = start + (end - start) / 2; // Same thing beter way

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                // target == mid (Got Answer)
                return middle;
            }
        }

        return -1;
    }
}
