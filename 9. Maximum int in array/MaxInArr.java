import javax.xml.stream.events.EndDocument;

public class MaxInArr {

    public static void main(String[] args) {

        int[] arr = { 3, 4, 67, 54, 56, 12 };
        int start = 2;
        int end = 5;

        System.out.println(max(arr, start, end));
    }

    static int max(int[] arr, int start, int end) {

        int maxVal = arr[start];

        for (int i = start; i < end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}