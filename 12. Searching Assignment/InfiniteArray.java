public class InfiniteArray {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers
        // In short we cannot use arr.length
        // https://youtu.be/W9QJ8HaRvJQ?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=5903

        int arr[] = new int[] { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 100;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = start;
            start = end + 1;
            // new end = previous end + (size of last chunk) * 2;
            end = end + (end - temp + 1) * 2;
        }

        return searchWithBinary(arr, target, start, end);
    }

    static int searchWithBinary(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
