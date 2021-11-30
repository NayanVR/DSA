import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // geeksforgeeks.org/recursive-bubble-sort/
        // int[] arr = { 5, 3, 4, 1, 2 };
        int[] arr = { 1, 2, 3, 4, 5 };
        bubble(arr, 0, 1, false);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int i, int j, boolean swapped) {
        if (i >= arr.length) {
            return;
        }
        if (j >= arr.length - i) {
            if (!swapped) {
                return;
            }
            i++;
            j = 1;
        }
        if (arr[j - 1] > arr[j]) {
            swap(arr, j - 1, j);
            swapped = true;
        }
        bubble(arr, i, ++j, swapped);
    }

    static void swap(int[] arr, int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
