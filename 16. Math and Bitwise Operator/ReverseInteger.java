public class ReverseInteger {
    public static void main(String[] args) {
        int x = -1563847412;
        System.out.println(x);
        System.out.println(reverse(x));
    }

    static long reverse(int x) {

        int length = (int) (Math.log10(Math.abs(x)) + 1);
        System.out.println(length);
        long reverse = 0;

        while (length > 0) {
            int remainder = x % 10;
            reverse += remainder * Math.pow(10, length - 1);
            x /= 10;
            length--;
        }

        if (reverse > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int) reverse;
        }
    }
}
