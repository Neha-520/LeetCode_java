public class _1463CherryPickupII {
    class Solution {
        public int cherryPickup(int[][] grid) {
            int n = grid.length, m = grid[0].length;
            Integer dp[][][] = new Integer[n][m][m];
            return dfs(grid, n, m, 0, 0, m - 1, dp);
        }

        public int dfs(int[][] grid, int n, int m, int r, int c1, int c2, Integer[][][] dp) {
            if (r < 0 || r >= n || c1 < 0 || c1 >= m || c2 < 0 || c2 >= m)
                return 0;

            if (dp[r][c1][c2] != null)
                return dp[r][c1][c2];
            int maxCherries = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newC1 = c1 + i;
                    int newC2 = c2 + j;
                    maxCherries = Math.max(maxCherries, dfs(grid, n, m, r + 1, newC1, newC2, dp));
                }
            }
            int currCherries = 0;
            if (c1 == c2)
                currCherries = grid[r][c1];
            else
                currCherries = grid[r][c1] + grid[r][c2];

            dp[r][c1][c2] = maxCherries + currCherries;

            return dp[r][c1][c2];
        }
    }
}
