public class _312BurstBalloons {
    class Solution {
        public int maxCoins(int[] nums) {
            int n = nums.length;
            int[] extended = new int[n + 2];
            extended[0] = extended[n + 1] = 1;
            for (int i = 1; i < n + 1; i++)
                extended[i] = nums[i - 1];

            int[][] memoriz = new int[n + 2][n + 2];
            return getMaxCoins(extended, memoriz, 0, n + 1);
        }

        public int getMaxCoins(int[] extended, int[][] memoriz, int left, int right) {
            if (left == right)
                return 0;
            if (memoriz[left][right] > 0)
                return memoriz[left][right];
            int max = 0;
            for (int i = left + 1; i < right; i++)
                max = Math.max(max,
                        extended[left] * extended[i] * extended[right] + getMaxCoins(extended, memoriz, left, i)
                                + getMaxCoins(extended, memoriz, i, right));

            memoriz[left][right] = max;
            return max;
        }
    }
}
