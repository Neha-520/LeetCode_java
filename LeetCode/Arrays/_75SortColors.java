public class _75SortColors {
    class Solution {
        public void sortColors(int[] nums) {
            int red = 0;
            int blue = nums.length - 1;
            for (int i = 0; i <= blue; i++) {
                if (nums[i] == 0) {
                    swap(nums, i, red);
                    red++;
                } else if (nums[i] == 2) {
                    swap(nums, i, blue);
                    i--;
                    blue--;
                }
            }
        }

        private void swap(int[] nums, int left, int right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
        }
    }
}
