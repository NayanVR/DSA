public class MinimumNum {
    public static void main(String[] args) {

        int[] arr = { 11, 23, 45, 3, 423, 4, 5 };

        System.out.println(minNum(arr));
    }

    static int minNum(int[] arr) {

        int minNum = arr[0];

        for (int num : arr) {
            if (num < minNum)
                minNum = num;
        }

        return minNum;
    }
}
