public class _1191KConcatenationMaximumSum {
    class Solution {
        public int kConcatenationMaxSum(int[] arr, int k) {
            long sum = 0;
            for (int n : arr)
                sum += n;
            int ans = 0;
            if (k == 1) {
                ans = (int) (kadane(arr) % 1000000007);
                return Math.max(ans, 0);
            }
            int a[] = new int[2 * arr.length];
            int n = arr.length;
            for (int i = 0; i < arr.length; i++) {
                a[i] = a[i + n] = arr[i];
            }
            if (sum < 0) {
                ans = (int) (kadane(a) % 1000000007);
                return Math.max(ans, 0);
            } else {
                ans = (int) ((kadane(a) + (k - 2) * sum) % 1000000007);
                return Math.max(ans, 0);
            }
        }

        public long kadane(int a[]) {
            long curBest = a[0], overallBest = a[0];
            for (int i = 1; i < a.length; i++) {
                if (curBest >= 0)
                    curBest = curBest + a[i];
                else
                    curBest = a[i];
                overallBest = Math.max(overallBest, curBest);
            }
            return overallBest;
        }
    }
}
