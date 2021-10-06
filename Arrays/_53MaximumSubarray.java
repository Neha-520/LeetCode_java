package Arrays;

public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {
            int curr_sum = 0, max_sum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                curr_sum += nums[i];
                if (curr_sum > max_sum) {
                    max_sum = curr_sum;
                }
                if (curr_sum < 0)
                    curr_sum = 0;
            }
            return max_sum;
        }
    }
}
