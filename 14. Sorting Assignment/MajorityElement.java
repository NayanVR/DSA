public class MajorityElement {
    public static void main(String[] args) {
        // https://leetcode.com/problems/majority-element/
        // We can solve it by bayor-moore's voting algo
        // https://youtu.be/X0G5jEcvroo
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] nums) {

        int ansElement = 0;
        int count = 0;

        for (int i : nums) {
            if (count == 0) {
                ansElement = i;
            }

            if (i == ansElement) {
                count++;
            } else {
                count--;
            }
        }

        // now we check if our ansElement is majority or not
        count = 0;
        for (int i : nums) {
            if (i == ansElement) {
                count++;
            }
            if (count > nums.length / 2) {
                return ansElement;
            }
        }

        return -1;
    }
}
