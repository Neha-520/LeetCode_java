public class _79WordSearch {
    class Solution {
        boolean flag = false;

        public boolean exist(char[][] board, String word) {
            int[][] visited = new int[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0))
                        helper(board, word, visited, i, j, 0);
                }
            }
            return flag;
        }

        void helper(char board[][], String word, int visited[][], int x, int y, int start) {
            if (start == word.length()) {
                flag = true;
                return;
            }
            if (x < 0 || y < 0 || x >= board.length || y >= board[0].length || visited[x][y] == 1
                    || board[x][y] != word.charAt(start))
                return;
            visited[x][y] = 1;

            helper(board, word, visited, x + 1, y, start + 1);
            helper(board, word, visited, x - 1, y, start + 1);
            helper(board, word, visited, x, y + 1, start + 1);
            helper(board, word, visited, x, y - 1, start + 1);
            visited[x][y] = 0;
        }
    }
}
