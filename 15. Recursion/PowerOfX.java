public class PowerOfX {
    public static void main(String[] args) {

        System.out.println(isPowerOfX(9, 3));
    }

    static boolean isPowerOfX(int n, int x) {
        if (n < 1) {
            return false;
        }
        if (n != 1 && n % x != 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        return isPowerOfX(n / x, x);
    }
}
