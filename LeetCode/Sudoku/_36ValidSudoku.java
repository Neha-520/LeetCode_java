
import java.util.HashSet;

public class _36ValidSudoku {
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            HashSet<String> h = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        if (!h.add("row" + i + board[i][j]) || !h.add("col" + j + board[i][j]))
                            return false;
                        if (!h.add("box" + (i / 3) * 3 + j / 3 + board[i][j]))
                            return false;
                    }
                }
            }
            return true;
        }
    }
}
