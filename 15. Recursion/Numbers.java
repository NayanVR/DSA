public class Numbers {
    public static void main(String[] args) {
        // Recursion
        // print 5 numbers
        print(1);
    }

    static void print(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        print(n + 1);
    }
}