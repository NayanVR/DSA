import java.util.Arrays;

public class maxAltitude {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-the-highest-altitude/submissions/

        int[] gain = { -4, -3, -2, -1, 4, 3, 2 };

        System.out.println(maxAlt(gain));
    }

    static int maxAlt(int[] gain) {

        int[] altitudes = new int[gain.length + 1];
        altitudes[0] = 0;
        int maxAlt = altitudes[0];

        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = altitudes[i] + gain[i];
            if (altitudes[i + 1] > maxAlt) {
                maxAlt = altitudes[i + 1];
            }
        }

        System.out.println(Arrays.toString(altitudes));

        return maxAlt;
    }
}
