import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 9, 2, 10 };
        // System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int mid = arr.length / 2;

        // copyOfRange(arr, 0, mid) => 0 index included, mid index excluded
        // ||(arr, mid, arr.length) => mid index included, arr.length index excluded
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeBoth(left, right);
    }

    static int[] mergeBoth(int[] first, int[] second) {

        int[] mergeArr = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mergeArr[k] = first[i];
                i++;
            } else {
                mergeArr[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible one array is not complete
        while (i < first.length) {
            mergeArr[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mergeArr[k] = second[j];
            j++;
            k++;
        }

        return mergeArr;
    }
}