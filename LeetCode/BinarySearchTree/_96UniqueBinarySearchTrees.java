public class _96UniqueBinarySearchTrees {
    class Solution {
        public int numTrees(int n) {
            int[] dp = new int[n + 1];
            dp[0] = dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                int temp = 0;
                for (int l = 0, r = i - 1; l <= i - 1; l++, r--) {
                    temp += dp[l] * dp[r];
                }
                dp[i] = temp;
            }
            return dp[n];
        }

    }
}
