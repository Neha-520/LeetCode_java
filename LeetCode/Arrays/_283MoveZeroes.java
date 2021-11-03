public class _283MoveZeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            for (int num : nums) {
                if (num != 0) {
                    nums[j] = num;
                    j++;
                }
            }
            for (int i = j; i < nums.length; i++)
                nums[i] = 0;
        }
    }
}
