public class MinMaxGame {

    public static void main(String[] args) {

        int nums[] = { 1, 3, 5, 2, 4, 8, 2, 2 };
        int ans = findWinner(nums, 0, nums.length - 1, false);
        System.out.println(ans);
    }

    public static int findWinner(int[] nums, int s, int e, boolean checkMax) {

        if (s + 1 == e) {
            if (checkMax) {
                return nums[s] > nums[e] ? nums[s] : nums[e];
            } else {
                return nums[s] < nums[e] ? nums[s] : nums[e];
            }
        }

        int l = findWinner(nums, s, e / 2, false);
        int r = findWinner(nums, (s + e + 1) / 2, e, true);

        if (checkMax) {
            return nums[l] > nums[r] ? nums[l] : nums[r];
        } else {
            return nums[l] < nums[r] ? nums[l] : nums[r];
        }
    }
}