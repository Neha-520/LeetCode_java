public class _1314MatrixBlockSum {
    class Solution {
        public int[][] matrixBlockSum(int[][] mat, int k) {
            int[][] dp = solveDp(mat);
            int n = mat.length, m = mat[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int R1 = Math.max(0, i - k);
                    int C1 = Math.max(0, j - k);
                    int R2 = Math.min(n - 1, i + k);
                    int C2 = Math.min(m - 1, j + k);
                    mat[i][j] = (dp[R2 + 1][C2 + 1] - dp[R2 + 1][C1] - dp[R1][C2 + 1] + dp[R1][C1]);
                }
            }
            return mat;
        }

        public int[][] solveDp(int[][] M) {
            int ylen = M.length + 1, xlen = M[0].length + 1;
            int[][] dp = new int[ylen][xlen];
            for (int i = 1; i < ylen; i++)
                for (int j = 1; j < xlen; j++)
                    dp[i][j] = M[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1];
            return dp;
        }
    }
}
