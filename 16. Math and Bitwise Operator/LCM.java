public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3, 7));
    }

    static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}