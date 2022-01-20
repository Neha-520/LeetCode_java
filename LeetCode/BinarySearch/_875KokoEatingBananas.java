public class _875KokoEatingBananas {
    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int max = 0;
            for (int i : piles)
                max = Math.max(i, max);
            int l = 1, r = max, k = 0;
            while (l < r) {
                int mid = l + (r - l) / 2, sum = 0;
                k = mid;
                for (int p : piles)
                    sum += (int) Math.ceil((double) p / k);
                if (sum > h)
                    l = mid + 1;
                else
                    r = mid;
            }
            return r;
        }
    }
}
