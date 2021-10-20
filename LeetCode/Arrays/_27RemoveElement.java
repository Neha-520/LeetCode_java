package Arrays;

public class _27RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int c = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[c] = nums[i];
                    c++;
                }
            }
            return c;
        }
    }
}
