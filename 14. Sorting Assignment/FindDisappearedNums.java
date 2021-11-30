import java.util.List;
import java.util.ArrayList;

public class FindDisappearedNums {
    public static void main(String[] args) {

        // https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(arr));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        cycle(nums);

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void cycle(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int currect = arr[i] - 1;
            if (arr[i] != arr[currect]) {
                swap(arr, i, currect);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
