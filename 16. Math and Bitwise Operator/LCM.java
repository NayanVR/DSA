import java.util.Arrays;

public class LCM {
    public static void main(String[] args) {
        // System.out.println(lcm(3, 7));
        System.out.println(largestPerimeter(new int[] { 1, 2, 8, 3, 6, 5 }));
    }

    public static int largestPerimeter(int[] arr) {

        Arrays.sort(arr);

        for (int i = arr.length - 1; i > 1; i--) {
            if (arr[i] < arr[i - 1] + arr[i - 2]) {
                return arr[i] + arr[i - 1] + arr[i - 2];
            }
        }
        return 0;
    }

    static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    static int gcd(int a, int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}