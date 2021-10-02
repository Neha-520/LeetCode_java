public class _746MinCostCLimbingStairs {

    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int zero = cost[0], one = cost[1], c = 0;
            for (int i = 2; i < cost.length; i++) {
                c = cost[i] + Math.min(zero, one);
                zero = one;
                one = c;
            }
            return Math.min(zero, one);
        }
    }

    // dp approach
    class Solution2 {
        // TC : O(n)
        // SC : O(n) => 2
        public int minCostClimbingStairs(int[] cost) {
            // dp signifies cost to use each stair starting the zeroth index
            int[] dp = new int[cost.length];
            dp[0] = cost[0];
            dp[1] = cost[1];
            for (int i = 2; i < cost.length; i++)
                dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
            return Math.min(dp[cost.length - 2], dp[cost.length - 1]);
        }
    }
}
