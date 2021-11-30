public class NumberOfStepsTo0 {
    public static void main(String[] args) {
        // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

        System.out.println(numberOfSteps(14, 0));
    }

    static int numberOfSteps(int num, int count) {

        if (num == 0) {
            return count;
        }

        if (num % 2 == 0) {
            count++;
            return numberOfSteps(num / 2, count);
        } else {
            count++;
            return numberOfSteps(num - 1, count);
        }
    }
}
