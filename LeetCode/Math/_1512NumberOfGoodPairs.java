public class _1512NumberOfGoodPairs {
    class Solution {
        public int numIdenticalPairs(int[] nums) {
            int[] c = new int[101];
            int ans = 0;
            for (int i : nums) {
                c[i]++;
            }
            for (int n : c) {
                ans += (n * (n - 1)) / 2;
            }
            return ans;
        }
    }
}
