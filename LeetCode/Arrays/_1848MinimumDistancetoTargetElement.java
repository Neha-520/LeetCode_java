public class _1848MinimumDistancetoTargetElement {
    class Solution {
        public int getMinDistance(int[] nums, int target, int start) {
            int min = Integer.MAX_VALUE, temp = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    temp = i;
                    min = Math.min(min, Math.abs(temp - start));
                }
            }
            return min;
        }
    }
}
