public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        // https://leetcode.com/problems/largest-perimeter-triangle/

        int[] arr = { 1, 2, 1, 2, 4 };

        System.out.println(largestPerimeter(arr));
    }

    static int largestPerimeter(int[] arr) {

        insertionDesc(arr);

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] < arr[i + 1] + arr[i + 2]) {
                return arr[i] + arr[i + 1] + arr[i + 2];
            }
        }
        return 0;
    }

    // insertion sort to sort in descending order
    static void insertionDesc(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = i - 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                } else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
