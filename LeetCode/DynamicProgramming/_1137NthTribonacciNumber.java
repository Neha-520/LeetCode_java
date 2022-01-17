
public class _1137NthTribonacciNumber {
    class Solution {
        public int tribonacci(int n) {
            int dp[] = new int[n + 1];
            for (int i = 0; i <= n; i++)
                dp[i] = -1;
            return helper(n, dp);
        }

        int helper(int n, int dp[]) {
            if (n == 0 || n == 1)
                return n;
            if (n == 2)
                return 1;
            if (dp[n] != -1)
                return dp[n];
            dp[n] = helper(n - 1, dp) + helper(n - 2, dp) + helper(n - 3, dp);
            return dp[n];
        }

    }

    class Solution2 {
        public int tribonacci(int n) {
            if (n == 0)
                return 0;
            if (n < 3)
                return 1;
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            return dp[n];
        }
    }
}
