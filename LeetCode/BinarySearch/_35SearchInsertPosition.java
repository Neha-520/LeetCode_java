package BinarySearch;

public class _35SearchInsertPosition {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int f = 0;
            int l = nums.length - 1;
            while (f <= l) {
                int m = (f + l) / 2;
                if (nums[m] < target) {
                    f = m + 1;
                } else if (nums[m] == target) {
                    return m;
                } else {
                    l = m - 1;
                }
            }
            return f;
        }
    }
}
