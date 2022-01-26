import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 9, 2, 10, 1 };
        int[] aux = Arrays.copyOf(arr, arr.length);
        // System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSort(arr, aux, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int[] aux, int s, int e) {
        if (s == e)
            return;

        int mid = (s + e) / 2;

        mergeSort(arr, aux, s, mid);
        mergeSort(arr, aux, mid + 1, e);

        mergeBoth(arr, aux, s, mid, e);
    }

    static void mergeBoth(int[] arr, int[] aux, int s, int m, int e) {

        int i = s, j = m + 1, k = s;

        while (i <= m && j <= e) {
            if (aux[i] < aux[j]) {
                arr[k] = aux[i];
                i++;
            } else {
                arr[k] = aux[j];
                j++;
            }
            k++;
        }

        // it may be possible one array is not complete
        while (i <= m) {
            arr[k] = aux[i];
            i++;
            k++;
        }

        while (j <= e) {
            arr[k] = aux[j];
            j++;
            k++;
        }
        // copy every element of mainArr to auxArr
        for (int index = 0; index < arr.length; index++) {
            aux[index] = arr[index];
        }
    }

}