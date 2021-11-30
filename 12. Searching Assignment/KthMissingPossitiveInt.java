public class KthMissingPossitiveInt {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kth-missing-positive-number/

        int[] arr = { 2, 3, 4, 7, 11 };
        int k = 5;

        System.out.println(findKthPositive(arr, k));
    }

    static int findKthPositive(int[] arr, int k) {
        int i = 1;
        int count = 0;

        while (count < k) {
            // This basically means i found in arr
            if (searchWithBinary(arr, i) != -1) {
                i++;
            } else {
                count++;
                if (count == k) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    static int searchWithBinary(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

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
