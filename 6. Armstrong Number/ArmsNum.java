
public class ArmsNum {

    public static void main(String[] args) {

        /*
         * What is Armstrong Number? -> Example : lets take number 153. now take it's
         * each individual number, here it is 1,5,3. Now do sum of cube of each number :
         * 1^3 + 5^3 + 3^3 = 1 + 126 + 27 = 153. if number we get is equal to original
         * number, then it is armstrong number.
         */

        isNumArmstong(154);
    }

    static void isNumArmstong(int num) {

        // same approach as Counting Occurrences

        int original = num;
        int sum = 0;

        while (num > 0) {
            int remainder = num % 10;
            int cube = remainder * remainder * remainder;
            sum += cube;
            num /= 10;
        }

        if (sum == original) {
            System.out.println("Thats Armstrong");
        } else {
            System.out.println("Oops it is not armstrong");
        }
    }
}