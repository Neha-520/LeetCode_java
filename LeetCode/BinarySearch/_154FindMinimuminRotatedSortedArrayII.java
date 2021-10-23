public class _154FindMinimuminRotatedSortedArrayII {
    class Solution {
        public int findMin(int[] nums) {
            int l = 0, h = nums.length - 1;
            if (nums[l] < nums[h])
                return nums[l];
            while (l < h) {
                int mid = l + (h - l) / 2;
                if (nums[mid] > nums[h])
                    l = mid + 1;
                else if (nums[mid] < nums[h])
                    h = mid;
                else
                    h--;
            }
            return nums[h];
        }
    }
}
