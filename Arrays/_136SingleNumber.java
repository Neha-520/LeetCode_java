package Arrays;

public class _136SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = sum ^ nums[i];
            }
            return sum;
        }
    }
}
