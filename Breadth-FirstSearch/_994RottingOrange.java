import java.util.ArrayDeque;
import java.util.Queue;

public class _994RottingOrange {
    class Solution {
        public int orangesRotting(int[][] grid) {
            Queue<int[]> q = new ArrayDeque<>();
            int[][] dirs = { { 0, 1 }, { -1, 0 }, { 1, 0 }, { 0, -1 } };
            int freshOranges = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1)
                        freshOranges++;
                    else if (grid[i][j] == 2)
                        q.add(new int[] { i, j });
                }
            }
            int level = 0;
            while (q.size() > 0) {
                int size = q.size();
                while (size-- > 0) {
                    int[] cell = q.remove();
                    for (int[] dir : dirs) {
                        int r = cell[0] + dir[0];
                        int c = cell[1] + dir[1];
                        if (r < 0 || c < 0 || r == grid.length || c == grid[0].length || grid[r][c] != 1)
                            continue;
                        grid[r][c] = 2;
                        freshOranges--;
                        q.add(new int[] { r, c });
                    }
                }
                if (q.size() != 0)
                    level++;
            }
            if (freshOranges == 0)
                return level;
            return -1;
        }
    }
}
