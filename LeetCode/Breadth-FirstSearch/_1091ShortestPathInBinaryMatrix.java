public class _1091ShortestPathInBinaryMatrix {
    class Solution {
        public int shortestPathBinaryMatrix(int[][] grid) {
            if (grid[0][0] == 1)
                return -1;
            int m = grid.length, n = grid[0].length;
            grid[0][0] = 1;
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[] { 0, 0, 1 });
            int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 1 }, { -1, -1 }, { 1, -1 }, { -1, 1 } };

            while (!q.isEmpty()) {
                int size = q.size();
                while (size-- > 0) {
                    int[] p = q.poll();
                    if (p[0] == m - 1 && p[1] == n - 1)
                        return p[2];
                    for (int[] d : dir) {
                        int r = p[0] + d[0];
                        int c = p[1] + d[1];
                        if (r >= 0 && c >= 0 && r < m && c < n && grid[r][c] == 0) {
                            q.add(new int[] { r, c, p[2] + 1 });
                            grid[r][c] = 1;
                        }
                    }
                }
            }
            return -1;
        }
    }
}
