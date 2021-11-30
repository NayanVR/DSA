import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {

        // https://leetcode.com/problems/build-array-from-permutation/

        int[] nums = { 0, 2, 1, 5, 3, 4 };

        System.out.println(Arrays.toString(buildArr(nums)));
    }

    static int[] buildArr(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}