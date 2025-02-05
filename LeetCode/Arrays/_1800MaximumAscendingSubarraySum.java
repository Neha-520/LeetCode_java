public class _1800MaximumAscendingSubarraySum {
    class Solution {
        public int maxAscendingSum(int[] nums) {
            int sum = 0, prev = 0, c = nums[0];
            for (int i = 1; i < nums.length; i++) {
                prev = nums[i - 1];
                if (nums[i] > prev)
                    c += nums[i];
                else
                    c = nums[i];
                sum = Math.max(c, sum);
            }
            return Math.max(sum, nums[0]);
        }
    }
}

class Solution {
    public int maxAscendingSum(int[] nums) {
       if(nums.length == 1) return nums[0];
       int max = nums[0],current= nums[0];
       for(int i = 0;i<nums.length-1;i++){
        if(nums[i+1]>nums[i]) current+=nums[i+1];
        else current = nums[i+1];
        max = Math.max(max,current);
       }
       return max;
    }
}
