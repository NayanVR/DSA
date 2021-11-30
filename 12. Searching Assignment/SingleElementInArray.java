public class SingleElementInArray {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

        // int[] arr = { 3, 3, 7, 7, 10, 11, 11 };
        // int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int[] arr = { 1, 2, 2 };

        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {

        if (nums.length == 1)
            return nums[0];

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 != 0) {
                if (mid > 0 && nums[mid - 1] == nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (mid > 0 && nums[mid - 1] == nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return nums[end];
    }
}
