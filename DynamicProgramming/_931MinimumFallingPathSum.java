public class _931MinimumFallingPathSum {
    class Solution {
        public int minFallingPathSum(int[][] matrix) {
            int min = Integer.MAX_VALUE;
            if (matrix.length == 1)
                return matrix[0][0];
            boolean flag = false;
            for (int i = 1; i < matrix.length; i++) {
                if (i == matrix.length - 1)
                    flag = true;
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j == 0)
                        matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i - 1][j + 1]);
                    else if (j == matrix[0].length - 1)
                        matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i - 1][j - 1]);
                    else
                        matrix[i][j] += Math.min(matrix[i - 1][j],
                                Math.min(matrix[i - 1][j - 1], matrix[i - 1][j + 1]));
                    if (flag)
                        min = Math.min(min, matrix[i][j]);
                }
            }
            return min;
        }
    }
}
