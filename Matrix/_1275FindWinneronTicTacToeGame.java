package Matrix;

public class _1275FindWinneronTicTacToeGame {
    class Solution {
        public String tictactoe(int[][] moves) {
            int n = moves.length;
            if (n < 5)
                return "Pending";
            else if (n < 9) {
                if (wonByLastMove(moves)) {
                    return n % 2 == 1 ? "A" : "B";
                } else
                    return "Pending";
            }
            return wonByLastMove(moves) ? "A" : "Draw";
        }

        private boolean wonByLastMove(int[][] moves) {
            int[] lastMove = moves[moves.length - 1];
            int row = 1, col = 1, diag = 1, revDiag = 1;
            for (int i = moves.length - 3; i >= 0; i -= 2) {
                int[] curr = moves[i];
                if (curr[0] == lastMove[0])
                    row++;
                if (curr[1] == lastMove[1])
                    col++;
                if (curr[0] == curr[1] && lastMove[0] == lastMove[1])
                    diag++;
                if (curr[0] + curr[1] == 2 && lastMove[0] + lastMove[1] == 2)
                    revDiag++;
            }
            return row == 3 || col == 3 || diag == 3 || revDiag == 3;
        }
    }
}
