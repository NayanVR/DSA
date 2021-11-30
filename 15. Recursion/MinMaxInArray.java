public class MinMaxInArray {
    public static void main(String[] args) {
        // https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/

        int[] arr = { 4, 65, 34, 67, 23, 3 };

        System.out.println(min(arr, arr.length));
    }

    static int min(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        return Math.min(arr[n - 1], min(arr, n - 1));
    }
}
