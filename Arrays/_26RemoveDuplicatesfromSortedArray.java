package Arrays;

public class _26RemoveDuplicatesfromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int i = 1;
            for (int n : nums) {
                if (n > nums[i - 1]) {
                    nums[i] = n;
                    i++;
                }
            }
            return i;
        }
    }
}
