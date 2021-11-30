import java.util.Arrays;

public class SortArrByParityII {
    public static void main(String[] args) {
        // https://leetcode.com/problems/sort-array-by-parity-ii/submissions/

        int[] arr = { 3, 1, 4, 2 };

        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }

    static int[] sortArrayByParityII(int[] nums) {

        int i = 0;
        int count = 0;

        while (i < nums.length - 1) {
            if ((isEven(nums[i]) && !isEven(i)) || (!isEven(nums[i]) && isEven(i))) {
                if (count + i - 1 < nums.length) {
                    swap(nums, i, i + count + 1);
                    count++;
                }
            }

            if ((isEven(nums[i]) && isEven(i)) || (!isEven(nums[i]) && !isEven(i))) {
                i++;
                count = 0;
            }
        }

        return nums;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
