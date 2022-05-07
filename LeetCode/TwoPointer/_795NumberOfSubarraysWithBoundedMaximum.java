public class _795NumberOfSubarraysWithBoundedMaximum {
    class Solution {
        public int numSubarrayBoundedMax(int[] nums, int left, int right) {
            int i = 0, j = 0, count = 0, ans = 0;
            while (i < nums.length) {
                if (nums[i] >= left && nums[i] <= right) {
                    count = i - j + 1;
                    ans += count;
                } else if (nums[i] < left) {
                    ans += count;
                } else {
                    j = i + 1;
                    count = 0;
                }
                i++;
            }
            return ans;
        }
    }
}
