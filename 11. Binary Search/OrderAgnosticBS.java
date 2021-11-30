public class OrderAgnosticBS {
    public static void main(String[] args) {

        // Order Agnostic Binary Search -->
        // In this que we check wether array is ascending or decending, and do the
        // solution respectively.

        int[] arr = { 48, 34, 23, 18, 15, 7, 5, 2, 1, -1, -3 };
        int target = 1;

        System.out.println(searchWithBinary(arr, target));
    }

    static int searchWithBinary(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            // int middle = (start + end) / 2;
            // for large ammount of array (start + end) may exceeds limit of int in java

            int middle = start + (end - start) / 2; // Same thing beter way

            if (arr[middle] == target) {
                return middle;
            }

            // Checking if array is acending or decending
            if (isAsc) {
                if (target > arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            } else {
                if (target < arr[middle]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }

        return -1;
    }
}
