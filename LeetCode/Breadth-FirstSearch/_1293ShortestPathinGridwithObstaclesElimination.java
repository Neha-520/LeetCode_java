import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class _1293ShortestPathinGridwithObstaclesElimination {
    class Solution {
        public int shortestPath(int[][] grid, int k) {
            int[][] d = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
            int m = grid.length;
            int n = grid[0].length;
            int[][] a = new int[m][n];
            Queue<int[]> q = new ArrayDeque();
            q.offer(new int[] { 0, 0, k, 0 });
            for (int i = 0; i < m; i++) {
                Arrays.fill(a[i], -1);
            }
            while (!q.isEmpty()) {
                int[] curr = q.poll();
                int currI = curr[0];
                int currJ = curr[1];
                int currLives = curr[2];
                int currDistance = curr[3];
                if (currI == m - 1 && currJ == n - 1)
                    return currDistance;
                if (grid[currI][currJ] == 1)
                    currLives--;
                for (int[] dir : d) {
                    int nextI = currI + dir[0];
                    int nextJ = currJ + dir[1];
                    if (nextI < 0 || nextJ < 0 || nextI >= m || nextJ >= n || a[nextI][nextJ] >= currLives)
                        continue;
                    q.offer(new int[] { nextI, nextJ, currLives, currDistance + 1 });
                    a[nextI][nextJ] = currLives;
                }
            }
            return -1;
        }
    }
}
