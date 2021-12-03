public class _152MaximumProductSubArray {
    class Solution {
        public int maxProduct(int[] nums) {
            int res = Integer.MIN_VALUE;
            for (int x : nums)
                res = Math.max(res, x);
            int currMin = 1, currMax = 1;
            for (int x : nums) {
                if (x == 0) {
                    currMin = 1;
                    currMax = 1;
                    continue;
                }
                int temp = currMax * x;
                currMax = Math.max(x * currMin, Math.max(temp, x));
                currMin = Math.min(x * currMin, Math.min(temp, x));
                res = Math.max(res, currMax);
            }
            return res;
        }
    }
}
