public class MissingNumber {
    public static void main(String[] args) {

        // https://leetcode.com/problems/missing-number/

        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        cycleSort(arr);
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] nums) {
        int n = nums.length;
        cycleSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        return n;
    }

    // cycle sort with some modifications.
    static void cycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < arr.length && arr[i] != i) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}