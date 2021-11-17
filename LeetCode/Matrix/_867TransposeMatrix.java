public class _867TransposeMatrix {
    class Solution {
        public int[][] transpose(int[][] matrix) {
            int res[][] = new int[matrix[0].length][matrix.length];
            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    res[i][j] = matrix[j][i];
                }
            }
            return res;
        }
    }
}
