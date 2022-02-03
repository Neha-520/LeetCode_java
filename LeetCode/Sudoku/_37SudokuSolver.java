public class _37SudokuSolver {
    class Solution {
        public void solveSudoku(char[][] board) {
            solve(board);
        }

        boolean solve(char[][] board) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] == '.') {
                        for (char k = '1'; k <= '9'; k++) {
                            if (isValid(board, i, j, k)) {
                                board[i][j] = k;
                                if (solve(board))
                                    return true;
                                else
                                    board[i][j] = '.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        boolean isValid(char[][] board, int row, int col, char x) {
            for (int i = 0; i < 9; i++) {
                if (board[row][i] == x)
                    return false;
                if (board[i][col] == x)
                    return false;
                if (board[3 * (row / 3) + i / 3][3 * (col / 3) + (i % 3)] == x)
                    return false;
            }
            return true;
        }
    }
}
