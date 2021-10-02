
public class _70ClimbingStairs {
    class Solution {
        public int climbStairs(int n) {
            if (n <= 0)
                return 0;
            if (n <= 2)
                return n;

            int last = 2;
            int secondLast = 1;
            for (int i = 3; i <= n; i++) {
                int sum = last + secondLast;
                secondLast = last;
                last = sum;
            }
            return last;
        }
    }

    // using memoization
    class Solution1 {
        public int climbStairs(int n) {
            return countPaths(n, new int[n + 1]);
        }

        int countPaths(int n, int dpMemoi[]) {
            if (n == 0)
                return 1;
            else if (n < 1)
                return 0;
            if (dpMemoi[n] > 0)
                return dpMemoi[n];
            int cp = countPaths(n - 1, dpMemoi) + countPaths(n - 2, dpMemoi);
            dpMemoi[n] = cp;
            return cp;
        }

    }

    // tabular method
    class Solution2 {
        public int climbStairs(int n) {
            int dp[] = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i <= n; i++) {
                if (i == 1)
                    dp[i] += dp[i - 1];
                else
                    dp[i] += dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }
    }
}
