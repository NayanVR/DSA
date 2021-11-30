public class EvenDigits {
    public static void main(String[] args) {

        // Question
        // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

        int[] arr = { 12, 345, 2, 6, 7896 };

        System.out.println(getEven(arr));
    }

    static int getEven(int[] arr) {

        int count = 0;

        for (int number : arr) {
            if (digits2(number) % 2 == 0)
                count++;
        }

        // Also possible wway
        // for (int number : arr) {
        // if (Integer.toString(number).length() % 2 == 0)
        // count++;
        // }

        return count;
    }

    static int digits(int number) {
        int count = 0;

        // if number is 0 then return 1 digit
        if (number == 0) {
            return 1;
        }
        // if number is negative then we have to convert into positive
        if (number < 0) {
            number *= -1;
        }

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    static int digits2(int number) {
        // if number is negative then we have to convert into positive
        if (number < 0) {
            number *= -1;
        }
        return (int) Math.log10(number) + 1;
    }
}
