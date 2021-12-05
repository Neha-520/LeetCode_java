public class _200NumberofIslands {
    class Solution {
        int c = 0;

        public int numIslands(char[][] mat) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] == '1') {
                        c++;
                        dfs(mat, i, j);
                    }
                }
            }
            return c;
        }

        public void dfs(char[][] mat, int i, int j) {
            if (i < 0 || j < 0 || i >= mat.length || j >= mat[i].length || mat[i][j] != '1')
                return;
            mat[i][j] = '0';
            dfs(mat, i + 1, j);
            dfs(mat, i - 1, j);
            dfs(mat, i, j + 1);
            dfs(mat, i, j - 1);
        }
    }
}
