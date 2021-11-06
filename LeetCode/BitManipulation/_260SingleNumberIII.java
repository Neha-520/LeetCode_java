public class _260SingleNumberIII {
    class Solution {
        public int[] singleNumber(int[] nums) {
            int sum = 0, sum1 = 0, sum2 = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum ^ nums[i];
            }
            sum = sum & (-sum);
            for (int i = 0; i < nums.length; i++) {
                if ((sum & nums[i]) > 0)
                    sum1 = sum1 ^ nums[i];
                else
                    sum2 = sum2 ^ nums[i];
            }
            return new int[] { sum1, sum2 };
        }
    }
}
