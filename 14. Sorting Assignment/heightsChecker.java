public class heightsChecker {
    public static void main(String[] args) {
        // https://leetcode.com/problems/height-checker/
        int[] heights = { 5, 1, 2, 3, 4 };

        System.out.println(heightCheck(heights));
    }

    static int heightCheck(int[] heights) {
        int[] heightOriginal = heights.clone();
        selection(heights);

        int count = 0;

        for (int i = 0; i < heightOriginal.length; i++) {
            if (heightOriginal[i] != heights[i]) {
                count++;
            }
        }

        return count;
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
