import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        // https://leetcode.com/problems/first-missing-positive/

        int[] arr = { 3, 4, -1, 1 };
        System.out.println(firstMissingPositive(arr));
        ;
    }

    static int firstMissingPositive(int[] arr) {

        cycleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // if all elements are from 1 to n sorted perfectly the ans will n + 1
        return arr.length + 1;
    }

    // cycle sort with some modification
    static void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int currect = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[currect]) {
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
