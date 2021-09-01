package Arrays;

public class _189RotateArray {
    class Solution {
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            rev(nums, 0, nums.length - 1);
            rev(nums, 0, k - 1);
            rev(nums, k, nums.length - 1);
        }

        public void rev(int a[], int l, int r) {
            while (l < r) {
                int t = a[l];
                a[l++] = a[r];
                a[r--] = t;
            }
        }
    }
}
