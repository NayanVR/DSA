import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 1;
        int b = 2;

        if (n == 1) {
            System.out.print("0 ");
        } else {
            System.out.print("0 1 ");
        }
        for (int i = 2; i < n; i++) {
            System.out.print(a + " ");
            int temp = b;
            b = b + a;
            a = temp;
        }
    }
}
