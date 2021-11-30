public class SquareRoot {

    public static void main(String[] args) {
        // https://leetcode.com/problems/sqrtx/

        System.out.println(mySqrt(15));
    }

    public static int mySqrt(int x) {

        int low = 1, high = x / 2, ans = 1;

        if (x == 0)
            return 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}