public class OddEven {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(check(n));
    }

    private static String check(int n) {
        return (n & 1) == 1 ? "Odd" : "Even";
    }
}