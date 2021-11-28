public class _238ProductOfArrayExceptSelf {
    class Solution {
        public int[] productExceptSelf(int[] nums) {
            int[] a = new int[nums.length];
            for (int i = 0; i < nums.length; i++)
                a[i] = 1;
            int l = 1, r = 1;
            for (int i = 0, j = nums.length - 1; i < nums.length - 1; i++, j--) {
                l *= nums[i];
                r *= nums[j];
                a[i + 1] *= l;
                a[j - 1] *= r;
            }
            return a;
        }
    }
}
