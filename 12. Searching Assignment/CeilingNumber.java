public class CeilingNumber {
    public static void main(String[] args) {

        // What is Ceiling Number?
        // In the given example { 2, 4, 6, 7, 9, 10, 11, 14, 16, 18 }, let's suppose
        // target is 15.
        // if 15 is not in arr. then return smallest greater element.
        // which is here 16(Ceiling Number)

        int[] arr = { 2, 4, 6, 7, 9, 10, 11, 14, 16, 18 };
        int target = 15;

        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end])
            return -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}