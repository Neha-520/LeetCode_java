public class _2161PartitionArrayAccordingToGivenPivot {
    class Solution {
        public int[] pivotArray(int[] nums, int pivot) {
            int[] ans = new int[nums.length];
            int start = 0;
            int i = 0, c = 0;
            while (start < nums.length) {
                if (nums[start] < pivot)
                    ans[i++] = nums[start];
                else if (nums[start] == pivot)
                    c++;
                start++;
            }
            start = 0;
            for (int j = 0; j < c; j++) {
                ans[i++] = pivot;
            }
            while (start < nums.length) {
                if (nums[start] > pivot)
                    ans[i++] = nums[start];
                start++;
            }
            return ans;
        }
    }
}
