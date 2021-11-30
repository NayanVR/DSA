public class FindDuplicateNum {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-duplicate-number/
        // https://leetcode.com/problems/find-all-duplicates-in-an-array/

        int[] arr = { 2, 1, 4, 2, 3 };
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] nums) {

        int i = 0;

        while (i < nums.length) {
            int currect = nums[i] - 1;
            if (nums[i] != nums[currect]) {
                swap(nums, i, currect);
            } else {
                if (i != currect) {
                    return nums[i];
                }
                i++;
            }
        }

        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
