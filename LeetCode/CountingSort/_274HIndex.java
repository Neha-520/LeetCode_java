public class _274HIndex {
    class Solution {
        public int hIndex(int[] nums) {
            int[] bucket = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > nums.length)
                    bucket[nums.length]++;
                else
                    bucket[nums[i]]++;
            }
            int c = 0;
            for (int i = bucket.length - 1; i >= 0; i--) {
                c += bucket[i];
                if (c >= i)
                    return i;
            }
            return 0;
        }
    }
}
