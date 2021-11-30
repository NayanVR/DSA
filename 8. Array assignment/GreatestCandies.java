import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies).toString());
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<Boolean>();
        int maxCandies = 0;

        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        for (int candy : candies) {
            if ((candy + extraCandies) >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
