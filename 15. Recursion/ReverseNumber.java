public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    // 12321 is palindrome if we reverse it 12321.
    static boolean palindrome(int n) {
        return n == reverse(n);
    }

    static int reverse(int n) {

        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        int rem = n % 10;
        if (rem == n) {
            return n;
        }
        return (int) (rem * Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
