public class _1413MinimumValueToGetPositiveStepbyStepSum {
    class Solution {
        public int minStartValue(int[] nums) {
            int minVal = 0;
            int total = 0;
            for (int num : nums) {
                total += num;
                minVal = Math.min(minVal, total);
            }
            return -minVal + 1;
        }
    }
}
