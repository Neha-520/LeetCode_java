public class _909SnakesAndLadders {
    class Solution {
        public int snakesAndLadders(int[][] board) {
            int n = board.length;
            int steps = 0;
            boolean[][] vis = new boolean[n][n];
            Queue<Integer> q = new LinkedList<Integer>();
            q.add(1);
            vis[n - 1][0] = true;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int k = 0; k < size; k++) {
                    int x = q.poll();
                    if (x == n * n)
                        return steps;
                    for (int i = 1; i <= 6; i++) {
                        if (i + x > n * n)
                            break;
                        int[] pos = findCoordinate(i + x, n);
                        int r = pos[0];
                        int c = pos[1];
                        if (vis[r][c])
                            continue;
                        vis[r][c] = true;
                        if (board[r][c] == -1)
                            q.add(i + x);
                        else
                            q.add(board[r][c]);
                    }
                }
                steps++;
            }
            return -1;
        }

        public int[] findCoordinate(int curr, int n) {
            int r = n - (curr - 1) / n - 1;
            int c = (curr - 1) % n;
            if (r % 2 == n % 2)
                return new int[] { r, n - 1 - c };
            else
                return new int[] { r, c };
        }
    }
}
