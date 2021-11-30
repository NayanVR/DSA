import java.util.*;

public class minimumAbsoluteDiff {
    public static void main(String[] args) {
        // https://leetcode.com/problems/minimum-absolute-difference/

        int[] arr = { 1, 3, 6, 10, 15 };

        System.out.println(minimumAbsDifference(arr).toString());
    }

    static List<List<Integer>> minimumAbsDifference(int[] arr) {

        // insertion(arr);
        Arrays.sort(arr);

        int minDiff = findMinDiff(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == minDiff) {
                ans.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }

        return ans;
    }

    static int findMinDiff(int[] arr) {

        int minDiff = arr[1] - arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minDiff) {
                minDiff = arr[i + 1] - arr[i];
            }
        }

        return minDiff;
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    // left side is already sorted
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
