public class _509FibbonaciNumber {
    class Solution {
        public int fib(int n) {
            int dp[] = new int[n + 1];
            for (int i = 0; i < dp.length; i++)
                dp[i] = -1;
            return helper(n, dp);
        }

        int helper(int n, int dp[]) {
            if (n <= 1)
                return n;
            if (dp[n] != -1)
                return dp[n];
            dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
            return dp[n];
        }
    }
}
