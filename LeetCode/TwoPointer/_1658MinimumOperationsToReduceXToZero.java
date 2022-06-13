public class _1658MinimumOperationsToReduceXToZero {
    class Solution {
    public int minOperations(int[] nums, int x) {
       int total = 0;
        for (int num: nums)  total += num;
        if (total < x) return -1;
        total = total - x;
        int i = 0, j = 0, sum = 0, ans = -1, n = nums.length;
        while (i < n) {
            sum = sum + nums[i];
            if (sum == total) {
                ans = Math.max(ans, i - j + 1);
            } else if (sum > total) {
                while (j <= i && sum > total) {
                    sum = sum - nums[j];
                    j++;
                }
                if (sum == total) ans = Math.max(ans, i - j + 1);
            }
            i++;
        }
        if (ans == -1) return -1;
        return nums.length - ans;
    }
}
}
