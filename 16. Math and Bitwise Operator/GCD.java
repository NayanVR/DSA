public class GCD {
    public static void main(String[] args) {

        System.out.println(gcd(7, 3));
    }

    static int gcd(int a, int b) {

        // Ex: what is gcd of 0 and 27 => 27 obviously
        // if (a == 0) {
        // return b;
        // }
        // return gcd(b % a, a);

        return a == 0 ? b : gcd(b % a, a);
    }
}
