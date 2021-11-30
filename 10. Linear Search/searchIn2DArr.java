import java.util.Arrays;

public class searchIn2DArr {
    public static void main(String[] args) {

        int[][] arr = { { 45, 65, 3 }, { 34, 78 }, { 38, 92, 89, 72 } };
        int target = 92;

        int[] ans = findIn2D(arr, target); // Format of return value {row, col}

        System.out.println(Arrays.toString(ans));
    }

    static int[] findIn2D(int[][] arr, int target) {

        int[] notFound = { -1, -1 };

        if (arr.length == 0)
            return notFound;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[] { row, col };
            }
        }

        return notFound;
    }
}
