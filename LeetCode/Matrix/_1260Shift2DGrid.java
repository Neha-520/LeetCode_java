public class _1260Shift2DGrid {
    class Solution {
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int n = grid.length, m = grid[0].length;
            int[][] temp = grid;
            while (k-- > 0) {
                temp = new int[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 1; j < m; j++) {
                        temp[i][j] = grid[i][j - 1];
                    }
                }
                for (int i = 1; i < n; i++) {
                    temp[i][0] = grid[i - 1][m - 1];
                }
                temp[0][0] = grid[n - 1][m - 1];
                grid = temp;
            }
            return (List) Arrays.asList(temp);
        }
    }
}
