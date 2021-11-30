public class factorial {
    public static void main(String[] args) {
        System.out.println(facto(4));
    }

    static int facto(int n) {
        return n <= 1 ? 1 : n * facto(n - 1);
    }
}
