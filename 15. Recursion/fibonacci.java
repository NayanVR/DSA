public class fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8
        // 0 is 0th fibo num
        // 1 is 1st fibo num
        System.out.println(fibo(6));
    }

    static int fibo(int n) {
        return n < 2 ? n : fibo(n - 1) + fibo(n - 2);
    }
}
