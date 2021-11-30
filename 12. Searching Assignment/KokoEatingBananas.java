public class KokoEatingBananas {
    public static void main(String[] args) {
        // https://leetcode.com/problems/koko-eating-bananas/

        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        // int[] piles = { 30, 11, 23, 4, 20 };
        // int h = 5;
        // int[] piles = { 312884470 };
        // int h = 312884469;

        System.out.println(minEatingSpeed(piles, h));
    }

    static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = maxInArray(piles);
        int ans = 1;

        while (start <= max) {

            int mid = start + (max - start) / 2;
            boolean allEaten = isAllBananasEaten(piles, h, mid);

            if (allEaten) {
                ans = mid;
                max = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    static boolean isAllBananasEaten(int[] piles, int h, int k) {

        int timeTaken = 0;

        // 3 + 6 + 7 + 11 / k (this may exeeds limit)
        // so 3/k + 6/k + 7/k + 11/k
        for (int bananas : piles) {
            timeTaken += bananas % k != 0 ? (bananas / k) + 1 : bananas / k;
        }

        return timeTaken <= h;
    }

    static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
