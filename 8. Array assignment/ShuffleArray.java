import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/shuffle-the-array/

        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;

        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] ans = new int[n * 2];

        for (int i = 0, j = 0; i < n * 2; i += 2, j++) {
            ans[i] = nums[j];
            ans[i + 1] = nums[j + n];
        }

        return ans;
    }
}
