public class ReverseNum {

    public static void main(String[] args) {

        int num = 15746; // same approach as counting occurrence
        int reversedNum = 0; // 64751

        while (num > 0) {

            int remainder = num % 10;

            reversedNum = (reversedNum * 10) + remainder; // for 2nd iteration (6 * 10) + 4 and so on

            num /= 10;
        }

        System.out.println(reversedNum);
    }
}