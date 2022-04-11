public class _2017GridGame {
    class Solution {
        public long gridGame(int[][] g) {
            int n = g[0].length;
            long[] f = new long[n];
            f[0] = g[0][0];
            long[] s = new long[n];
            s[n - 1] = g[1][n - 1];

            for (int i = 1; i < n; ++i)
                f[i] = f[i - 1] + g[0][i];
            for (int i = n - 2; i >= 0; --i)
                s[i] = s[i + 1] + g[1][i];

            long ans = Math.min(f[n - 1], s[0]);
            for (int i = 0; i < n; ++i)
                ans = Math.min(Math.max(f[n - 1] - f[i], s[0] - s[i]), ans);

            return ans;
        }
    }
}
