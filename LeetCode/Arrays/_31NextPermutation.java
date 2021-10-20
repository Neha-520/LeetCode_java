package Arrays;

public class _31NextPermutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            if (nums.length == 0 || nums.length == 1)
                return;
            int ans = -1;
            for (int i = nums.length - 1; i > 0; i--) {
                if (nums[i - 1] < nums[i]) {
                    ans = i;
                    break;
                }
            }
            if (ans == -1)
                rev(nums, 0, nums.length - 1);
            else {
                int prev = ans;
                for (int i = ans + 1; i < nums.length; i++) {
                    if (nums[i] <= nums[prev] && nums[i] > nums[ans - 1])
                        prev = i;
                }
                swap(nums, ans - 1, prev);
                rev(nums, ans, nums.length - 1);
            }
        }

        void rev(int a[], int i, int j) {
            while (i <= j) {
                int x = a[i];
                a[i++] = a[j];
                a[j--] = x;
            }
        }

        void swap(int a[], int i, int j) {
            int x = a[i];
            a[i] = a[j];
            a[j] = x;
        }
    }
}
