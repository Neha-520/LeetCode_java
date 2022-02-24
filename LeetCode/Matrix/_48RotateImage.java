public class _48RotateImage {
    class Solution {
        public void rotate(int[][] m) {
            int temp = 0;
            for (int i = 0; i < m.length; i++) {
                for (int j = i; j < m[0].length; j++) {
                    temp = m[i][j];
                    m[i][j] = m[j][i];
                    m[j][i] = temp;
                }
            }
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length / 2; j++) {
                    temp = m[i][j];
                    m[i][j] = m[i][m.length - 1 - j];
                    m[i][m.length - 1 - j] = temp;
                }
            }
        }
    }
}
