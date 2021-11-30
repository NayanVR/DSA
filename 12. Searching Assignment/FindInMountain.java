public class FindInMountain {
    public static void main(String[] args) {
        // Hard --> https://leetcode.com/problems/find-in-mountain-array/

        int[] arr = { 1, 5, 3 };
        int target = 3;

        System.out.println(findInMountainArray(arr, target));
    }

    static int findInMountainArray(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        int peak = -1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        peak = start;
        System.out.println(peak);

        if (arr[peak] == target) {
            return peak;
        }

        int ans = searchWithBinary(arr, target, 0, peak, true);

        if (ans != -1) {
            return ans;
        } else {
            return searchWithBinary(arr, target, peak, arr.length - 1, false);
        }
    }

    static int searchWithBinary(int[] arr, int target, int start, int end, boolean isAsc) {

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (arr[middle] == target) {
                return middle;
            }

            if (isAsc) {
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (target < arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }

        return -1;
    }
}
