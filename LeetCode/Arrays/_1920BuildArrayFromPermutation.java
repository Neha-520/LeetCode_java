public class _1920BuildArrayFromPermutation {
    class Solution {
        public int[] buildArray(int[] nums) {
            int[] ans = new int[nums.length];
            int i = 0;
            for (int n : nums) {
                ans[i++] = nums[n];
            }
            return ans;
        }
    }
}
