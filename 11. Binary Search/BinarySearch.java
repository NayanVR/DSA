public class BinarySearch {

    public static void main(String[] args) {

        // array have to be sorted
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
        int target = 36;

        System.out.println(searchWithBinary(arr, target));

    }

    static int searchWithBinary(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            // int middle = (start + end) / 2;
            // for large ammount of array (start + end) may exceeds limit of int in java

            int middle = start + (end - start) / 2; // Same thing beter way

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                // target == mid (Got Answer)
                return middle;
            }
        }

        return -1;
    }

}