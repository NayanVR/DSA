import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/merge-sorted-array/

        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };

        merge(nums1, 3, nums2, nums2.length);

    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {

        // Approach
        // First merge array and then sort it

        int index = 0;

        for (int j = 0; j < nums1.length; j++) {

            if (index >= nums2.length)
                break;

            if (nums1[j] == 0) {
                nums1[j] = nums2[index];
                index++;
            }
        }

        insertion(nums1);

        // now nums2 is merged into nums1
    }

    static void insertion(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                } else {
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
