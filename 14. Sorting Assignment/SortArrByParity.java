import java.util.Arrays;

public class SortArrByParity {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-array-by-parity/

        // int[] arr = { 0, 1, 2 };
        int[] arr = { 3, 2, 4 };
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    static int[] sortArrayByParity(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            if (!isEven(nums[start])) {
                swap(nums, start, end);
                end--;
            } else {
                start++;
            }
        }

        // for (int i = 0; i < nums.length / 2 + 1; i++) {
        // if (nums[i] % 2 != 0) {
        // swap(nums, i, nums.length - i - 1);
        // }
        // }

        return nums;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
