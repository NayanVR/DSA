import java.util.Arrays;

public class TwoSums {
    public static void main(String[] args) {
        // https://leetcode.com/problems/two-sum/

        int[] nums = { -1, -2, -3, -4, -5 };
        int target = -8;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        return new int[2];
    }
}
