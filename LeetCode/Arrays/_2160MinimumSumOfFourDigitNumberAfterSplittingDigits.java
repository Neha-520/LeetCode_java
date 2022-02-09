public class _2160MinimumSumOfFourDigitNumberAfterSplittingDigits {
    class Solution {
        public int minimumSum(int num) {
            int[] a = { num % 10, (num / 10) % 10, (num / 100) % 10, (num / 1000) % 10 };
            Arrays.sort(a);
            return a[0] * 10 + a[3] + a[1] * 10 + a[2];
        }
    }
}
