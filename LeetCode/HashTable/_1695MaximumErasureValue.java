public class _1695MaximumErasureValue {
    class Solution {
    public int maximumUniqueSubarray(int[] nums) {
       HashSet<Integer> hs = new HashSet<>();
        int i = 0, j = 0;
        int maxSum = 0;
        int sum = 0;
        while (j < nums.length) {
            if (hs.contains(nums[j]) == false) {
                sum += nums[j];
                hs.add(nums[j]);
                j++;
            } else {
                sum -= nums[i];
                hs.remove(nums[i]);
                i++;
            }
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum; 
    }
}
}
