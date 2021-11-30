public class IfNAndItsDouble {
    public static void main(String[] args) {
        // https://leetcode.com/problems/check-if-n-and-its-double-exist/

        int[] arr = { -20, 8, -6, -14, 0, -19, 14, 4 };

        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j] || arr[i] * 2 == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
