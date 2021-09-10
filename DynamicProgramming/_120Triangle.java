package DynamicProgramming;

import java.util.List;

public class _120Triangle {
    class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int n = triangle.size(), min = Integer.MAX_VALUE;
            if (n == 1)
                return triangle.get(0).get(0);
            int[][] dp = new int[n][n];
            dp[0][0] = triangle.get(0).get(0);
            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    dp[i][j] = Math.min(dp[i - 1][Math.max(j - 1, 0)], dp[i - 1][Math.min(j, i - 1)])
                            + triangle.get(i).get(j);
                    if (i == n - 1) {
                        min = Math.min(min, dp[i][j]);
                    }
                }
            }
            return min;
        }
    }
}
