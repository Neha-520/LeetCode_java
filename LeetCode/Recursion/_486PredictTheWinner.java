public class _486PredictTheWinner {
    class Solution {
        public boolean PredictTheWinner(int[] nums) {
            Integer[][] arr = new Integer[nums.length][nums.length];
            return helper(nums, 0, nums.length - 1, arr) >= 0;
        }

        public int helper(int[] nums, int s, int e, Integer[][] m) {
            if (s == e)
                return nums[s];
            if (m[s][e] != null)
                return m[s][e];
            int a = nums[s] - helper(nums, s + 1, e, m);
            int b = nums[e] - helper(nums, s, e - 1, m);
            m[s][e] = Math.max(a, b);
            return m[s][e];
        }
    }
}
