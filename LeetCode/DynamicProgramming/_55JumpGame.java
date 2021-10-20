public class _55JumpGame {
    class Solution {
        public boolean canJump(int[] nums) {
            int n = nums.length;
            int lastTrueIdx = n - 1;
            boolean currRes = true;

            for (int i = n - 2; i >= 0; i--) {
                int jumps = nums[i];
                if (jumps + i >= lastTrueIdx) {
                    currRes = true;
                    lastTrueIdx = i;
                } else
                    currRes = false;
            }

            return currRes;
        }
    }
}
