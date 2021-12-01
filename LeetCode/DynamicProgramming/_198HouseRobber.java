
public class _198HouseRobber {
    class Solution {
        public int rob(int[] nums) {
            int excluded = 0;
            int included = 0;
            for (int i = 0; i < nums.length; i++) {
                int temp = excluded;
                excluded = Math.max(included, excluded);
                included = temp + nums[i];
            }
            return Math.max(excluded, included);
        }
    }

    class Solution2 {
        public int rob(int[] nums) {
            if (nums.length == 0)
                return 0;
            int[] dp = new int[nums.length + 1];
            dp[0] = 0;
            dp[1] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
            }
            return dp[nums.length];
        }
    }
}
