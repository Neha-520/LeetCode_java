public class _45JumpGameII {
    class Solution {
        public int jump(int[] nums) {
            int[] dp = new int[nums.length];
            dp[dp.length - 1] = 0;
            for (int i = nums.length - 2; i >= 0; i--) {
                int min = Integer.MAX_VALUE - 1;
                if (nums[i] == 0)
                    dp[i] = min;
                else {
                    for (int j = 1; (i + j) < nums.length && j <= nums[i]; j++)
                        min = Math.min(min, dp[i + j]);
                    dp[i] = min + 1;
                }
            }
            return dp[0];
        }
    }
}
