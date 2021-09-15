
public class _463IslandPerimeter {
    class Solution {
        public int islandPerimeter(int[][] grid) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == 1)
                        return dfs(grid, i, j);
                }
            }
            return 4;
        }

        private int dfs(int[][] grid, int i, int j) {
            if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == 0)
                return 1;

            if (grid[i][j] == -1)
                return 0;
            grid[i][j] = -1;
            int l = dfs(grid, i, j - 1);
            int r = dfs(grid, i, j + 1);
            int t = dfs(grid, i - 1, j);
            int d = dfs(grid, i + 1, j);

            return l + r + t + d;
        }
    }
}
