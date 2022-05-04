public class _1800MaximumAscendingSubarraySum {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int sum = 0, prev = 0, c = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prev = nums[i - 1];
                if (nums[i] > prev)
                    c += nums[i];
                else
                    c = nums[i];
                sum = Math.max(c, sum);
            }
            return Math.max(sum, nums[0]);
        }
    }
}
