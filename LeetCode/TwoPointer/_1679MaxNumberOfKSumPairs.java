public class _1679MaxNumberOfKSumPairs {
    class Solution {
        public int maxOperations(int[] nums, int k) {
            Arrays.sort(nums);
            int c = 0;
            int i = 0, j = nums.length - 1;
            while (i < j) {
                if ((nums[i] + nums[j]) > k)
                    j--;
                else if ((nums[i] + nums[j]) < k)
                    i++;
                else {
                    c++;
                    i++;
                    j--;
                }
            }
            return c;
        }
    }
}
