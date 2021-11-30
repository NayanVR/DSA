import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class TargetArray {
    public static void main(String[] args) {

        // https://leetcode.com/problems/create-target-array-in-the-given-order/

        int[] nums = { 0, 1, 2, 3, 4 };

        int[] index = { 0, 1, 2, 2, 1 };

        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        int length = nums.length;
        List<Integer> list = new ArrayList();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
