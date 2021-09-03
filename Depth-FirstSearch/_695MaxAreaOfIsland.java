public class _695MaxAreaOfIsland {
    class Solution {
        static int max = 0;
        static int count = 0;

        public void dfs(int[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1)
                return;
            grid[i][j] = 0;
            count++;
            max = Math.max(count, max);
            dfs(grid, i + 1, j);
            dfs(grid, i - 1, j);
            dfs(grid, i, j + 1);
            dfs(grid, i, j - 1);
        }

        public int maxAreaOfIsland(int[][] grid) {
            int c = grid[0].length, r = grid.length;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (grid[i][j] == 1) {
                        count = 0;
                        dfs(grid, i, j);
                    }
                }
            }
            int res = max;
            max = 0;
            count = 0;
            return res;
        }
    }
}
