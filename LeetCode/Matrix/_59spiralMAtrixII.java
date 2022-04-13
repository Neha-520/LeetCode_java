public @interface _59spiralMAtrixII {
    class Solution {
        public int[][] generateMatrix(int n) {
            int[][] rs = new int[n][n];
            int t = n * n;
            int top = 0, bottom = n - 1, left = 0, right = n - 1;
            int num = 1;

            while (left <= right && top <= bottom) {
                for (int i = left; i <= right && num <= t; i++) {
                    rs[top][i] = num++;
                }
                top++;
                for (int i = top; i <= bottom && num <= t; i++) {
                    rs[i][right] = num++;
                }
                right--;
                for (int i = right; i >= left && num <= t; i--) {
                    rs[bottom][i] = num++;
                }
                bottom--;
                for (int i = bottom; i >= top && num <= t; i--) {
                    rs[i][left] = num++;
                }
                left++;
            }
            return rs;
        }
    }
}
