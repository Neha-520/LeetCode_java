package Matrix;

public class _566ReshapeTheMatrix {
    class Solution {
        public int[][] matrixReshape(int[][] mat, int r, int c) {
            if (r * c != mat.length * mat[0].length)
                return mat;
            int a[][] = new int[r][c];
            int x = 0, y = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    a[i][j] = mat[x][y++];
                    if (y == mat[0].length) {
                        y = 0;
                        x++;
                    }
                }
            }
            return a;
        }
    }
}
