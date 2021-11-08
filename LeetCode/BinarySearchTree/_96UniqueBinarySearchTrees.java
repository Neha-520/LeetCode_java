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

    class Solution2 {
        int[] dp = new int[20];

        public int numTrees(int n) {
            if (n <= 1)
                return 1;
            if (dp[n] > 0)
                return dp[n];
            for (int i = 1; i <= n; i++) {
                dp[n] += numTrees(i - 1) * numTrees(n - i);
            }
            return dp[n];
        }
    }
}
