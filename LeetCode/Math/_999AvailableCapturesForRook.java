public class _999AvailableCapturesForRook {
    class Solution {
        public int numRookCaptures(char[][] board) {
            int row = 0, col = 0;
            int pawn = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == 'R') {
                        row = i;
                        col = j;
                        break;
                    }
                }
            }
            for (int i = row; i >= 0; i--) {
                if (board[i][col] == 'B')
                    break;
                if (board[i][col] == 'p') {
                    pawn++;
                    break;
                }
            }
            for (int i = row; i < board.length; i++) {
                if (board[i][col] == 'B')
                    break;
                if (board[i][col] == 'p') {
                    pawn++;
                    break;
                }
            }
            for (int j = col; j < board.length; j++) {
                if (board[row][j] == 'B')
                    break;
                if (board[row][j] == 'p') {
                    pawn++;
                    break;
                }
            }
            for (int j = col; j >= 0; j--) {
                if (board[row][j] == 'B')
                    break;
                if (board[row][j] == 'p') {
                    pawn++;
                    break;
                }
            }
            return pawn;
        }
    }
}
