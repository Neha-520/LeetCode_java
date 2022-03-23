public class _713SubarrayProductLessThanK {
    class Solution {
        public int numSubarrayProductLessThanK(int[] nums, int k) {
            if (k <= 1)
                return 0;
            int p = 1;
            int i = 0, j = 0, c = 0;
            while (j < nums.length) {
                p *= nums[j];
                while (p >= k) {
                    p = p / nums[i];
                    i++;
                }
                c += j - i + 1;
                j++;
            }
            return c;
        }
    }
}
