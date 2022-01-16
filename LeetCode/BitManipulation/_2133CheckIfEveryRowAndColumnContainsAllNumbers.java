public class _2133CheckIfEveryRowAndColumnContainsAllNumbers {

    class Solution {
        public boolean checkValid(int[][] matrix) {
            int n = matrix.length, mask = 0;
            for (int i = 1; i <= n; i++)
                mask ^= i;

            for (int r = 0; r < n; r++) {
                int mask1 = mask, mask2 = mask;
                for (int c = 0; c < n; c++) {
                    mask1 ^= matrix[r][c];
                    mask2 ^= matrix[c][r];
                }
                if (mask1 != 0 || mask2 != 0)
                    return false; // xor of same numbers will return 0
            }
            return true;
        }
    }

    /// ......without bit manipulation
    class Solution2 {
        public boolean checkValid(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                boolean vis[] = new boolean[matrix.length + 1];
                boolean vis1[] = new boolean[matrix.length + 1];
                for (int j = 0; j < matrix[0].length; j++) {
                    if (!vis[matrix[i][j]])
                        vis[matrix[i][j]] = true;
                    if (!vis1[matrix[j][i]])
                        vis1[matrix[j][i]] = true;
                }
                for (int k = 1; k < vis.length; k++) {
                    if (!vis[k])
                        return false;
                    if (!vis1[k])
                        return false;
                }
            }
            return true;
        }
    }
}
