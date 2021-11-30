public class FloorNumber {
    public static void main(String[] args) {
        // What is Floor Number?
        // In the given example { 2, 4, 6, 7, 9, 10, 11, 14, 16, 18 }, let's suppose
        // target is 8.
        // if 8 is not in arr. then return biggest less element.
        // which is here 7(Floor Number)

        int[] arr = { 2, 4, 6, 7, 9, 10, 11, 14, 16, 18 };
        int target = 8;

        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        if (target < arr[start])
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

        return end;
    }
}
