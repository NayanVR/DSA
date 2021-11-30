import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {

        // cycle sort is only applied when arr is 1 to n

        int[] arr = { 5, 1, 3, 4, 2 };
        cycle(arr);
        System.out.println(Arrays.toString(arr));
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
