import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = { 1, 34, 3, 56, 23 };

        System.out.println(Arrays.toString(reverse(arr)));
    }

    // Kunal's approach
    static int[] reverse(int[] arr) {

        // So basically we are setting two pointers one at start and one at end
        // Now Swap elements
        // then increase start by one and decrease end by one

        int start = 0;
        int end = arr.length - 1;

        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    // My approach
    // static int[] reverse(int[] arr) {

    // int length = arr.length;
    // int[] revArr = new int[length];

    // for (int i = 0; i < length; i++) {
    // revArr[length - i - 1] = arr[i];
    // }

    // return revArr;
    // }
}