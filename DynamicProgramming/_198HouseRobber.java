package DynamicProgramming;

public class _198HouseRobber {
    class Solution {
        public int rob(int[] nums) {
            int excluded = 0;
            int included = 0;
            for (int i = 0; i < nums.length; i++) {
                int temp = excluded;
                excluded = Math.max(included, excluded);
                included = temp + nums[i];
            }
            return Math.max(excluded, included);
        }
    }
}
