public class SqrtNewtonRaphsonMethod {
    public static void main(String[] args) {
        double n = 40;
        System.out.println(sqrt(n));
    }

    static double sqrt(double n) {

        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + (n / x));
            // if error is less than 1 then we can say it is accurate ans
            // we can decrease 1 to .5 or .2 for more accuracy but it take more time
            if (Math.abs(root - x) < 1) {
                break;
            }
            x = root;
        }
        return root;
    }
}
