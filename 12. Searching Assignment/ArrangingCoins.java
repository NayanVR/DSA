public class ArrangingCoins {
    public static void main(String[] args) {
        // https://leetcode.com/problems/arranging-coins/

        System.out.println(arrangeCoins(6));
    }

    static int arrangeCoins(int n) {

        int start = 1;
        int end = n;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // requiredCoins is no of coins required for make that row.
            int requiredCoins = mid * (mid + 1) / 2;

            if (requiredCoins == n) {
                return mid;
            } else if (requiredCoins > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return end;
    }
}
