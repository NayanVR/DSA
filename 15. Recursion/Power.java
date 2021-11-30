public class Power {
    public static void main(String[] args) {

        System.out.println(myPow(2, -2));
    }

    static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n < 0) {
            return myPow(1 / x, -n);
        }
        return n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
