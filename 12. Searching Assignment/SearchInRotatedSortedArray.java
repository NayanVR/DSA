import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/search-in-rotated-sorted-array/

        int[] arr = { 5, 1, 3 };
        int target = 1;

        System.out.println(Arrays.toString(arr) + " Pivot --> " + findPivot(arr));
    }

    static int search(int[] arr, int target) {

        int pivot = findPivot(arr);

        if (arr[pivot] == target)
            return pivot;

        int ans = searchWithBinary(arr, target, 0, pivot - 1);

        if (ans != -1) {
            return ans;
        } else {
            return searchWithBinary(arr, target, pivot + 1, arr.length - 1);
        }
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int searchWithBinary(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
