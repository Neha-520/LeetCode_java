public class _918MaximumSumCircularSubarray {
    class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int minSum = Integer.MAX_VALUE, maxSum = Integer.MIN_VALUE, totalSum = 0;
            int sum1 = 0, sum2 = 0;
            for (int z : nums)
                totalSum += z;
            for (int i = 0; i < nums.length; i++) {
                sum1 += nums[i];
                maxSum = Math.max(sum1, maxSum);
                if (sum1 < 0)
                    sum1 = 0;
                sum2 += nums[i];
                minSum = Math.min(sum2, minSum);
                if (sum2 > 0)
                    sum2 = 0;
            }
            if (maxSum < 0)
                return maxSum;
            return Math.max(maxSum, totalSum - minSum);
        }
    }
}
