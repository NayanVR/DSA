public class PowerOfTwo {
    public static void main(String[] args) {
        // https://leetcode.com/problems/power-of-two/

        int n = 9;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if (n != 1 && n % 2 != 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return isPowerOfTwo(n / 2);
    }
}
