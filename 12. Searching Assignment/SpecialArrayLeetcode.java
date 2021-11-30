public class SpecialArrayLeetcode {
    public static void main(String[] args) {
        // https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

        int[] arr = { 0, 4, 3, 0, 4 };

        System.out.println(specialArray(arr));
    }

    static int specialArray(int[] nums) {

        for (int x = 0; x <= nums.length; x++) {
            int values = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= x) {
                    values++;
                }
            }
            if (values == x) {
                return x;
            }
        }

        return -1;
    }
}
