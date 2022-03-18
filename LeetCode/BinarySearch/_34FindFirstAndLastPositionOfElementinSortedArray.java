public class _34FindFirstAndLastPositionOfElementinSortedArray {
    class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] res = { -1, -1 };
            if (nums.length == 0)
                return res;
            int lo = 0, hi = nums.length - 1;
            while (nums[lo] < nums[hi]) {
                int mid = lo + (hi - lo) / 2;
                if (nums[mid] > target)
                    hi = mid - 1;
                else if (nums[mid] < target)
                    lo = mid + 1;
                else {
                    if (nums[lo] == nums[mid])
                        hi--;
                    else
                        lo++;
                }
            }
            if (nums[lo] == nums[hi] && nums[lo] == target) {
                res[0] = lo;
                res[1] = hi;
            }
            return res;
        }
    }
}
