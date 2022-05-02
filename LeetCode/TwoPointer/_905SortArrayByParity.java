public class _905SortArrayByParity {
    class Solution {
        public int[] sortArrayByParity(int[] nums) {
            int i = 0, j = nums.length - 1;
            while (i < j) {
                if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                    i++;
                    j--;
                } else if (nums[i] % 2 == 0 && nums[j] % 2 != 0)
                    i++;
                else if (nums[i] % 2 != 0 && nums[j] % 2 != 0)
                    j--;
                else if (nums[i] % 2 == 0 && nums[j] % 2 == 0)
                    i++;
            }
            return nums;
        }
    }
}
