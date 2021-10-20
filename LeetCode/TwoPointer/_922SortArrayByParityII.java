public class _922SortArrayByParityII {
    class Solution {
        public int[] sortArrayByParityII(int[] nums) {
            int result[] = new int[nums.length];
            int i = 0, j = 1, k = 0;
            while (k < nums.length) {
                if (nums[k] % 2 == 0) {
                    result[i] = nums[k++];
                    i += 2;
                } else {
                    result[j] = nums[k++];
                    j += 2;
                }
            }
            return result;
        }
    }
}
