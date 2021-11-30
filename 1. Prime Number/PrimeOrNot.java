import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int numroot = (int) Math.sqrt(num);
        boolean isPrime = true;

        long start = System.currentTimeMillis();

        for (int a = 2; a < numroot; a++) {
            if (num % a == 0) {
                isPrime = false;
                break;
            }
            a++;
        }
        long end = System.currentTimeMillis();

        if (isPrime) {
            System.out.println(num + " is Prime!");
        } else {
            System.out.println(num + " is not Prime!");
        }

        long elapsedTime = end - start;
        System.out.println("Time taken in millis : " + elapsedTime);
    }
}