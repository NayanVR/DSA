public class SumOfDigits {
    public static void main(String[] args) {

        // 143 -> 1 + 4 + 3 = 8
        int n = 143;
        System.out.println(sum(n));
    }

    static int sum(int n) {

        // if last digit is 4 then 4 % 10 = 4 hence return 4
        if (n % 10 == n)
            return n;

        return (n % 10) + sum(n / 10);
    }
}
