public class MaxWealth {
    public static void main(String[] args) {

        // Question
        // https://leetcode.com/problems/richest-customer-wealth/

        int[][] accounts = { { 1, 2, 3 }, { 2, 5, 3 }, { 1, 1, 5, 2 } };

        System.out.println(countMaxWealth(accounts));
    }

    static int countMaxWealth(int[][] accounts) {

        int maxWealth = 0;

        for (int row = 0; row < accounts.length; row++) {
            int rowSum = 0;
            for (int col : accounts[row]) {
                rowSum += col;
            }
            if (rowSum > maxWealth) {
                maxWealth = rowSum;
            }
        }

        return maxWealth;
    }
}
