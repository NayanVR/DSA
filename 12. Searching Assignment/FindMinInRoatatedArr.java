public class FindMinInRoatatedArr {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

        // int[] arr = { 4, 5, 6, 7, 8 };
        int[] arr = { 3, 4, 5, 1, 2 };

        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        // Same approach as finding pivot with some minor changes

        int start = 0;
        int end = nums.length - 1;

        // if array is rotated n times
        if (nums[start] < nums[end])
            return nums[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
