package Matrix;

import java.util.ArrayList;
import java.util.List;

public class _54SpiralMatrix {
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix) {
            int min_row = 0, min_col = 0, max_row = matrix.length - 1, max_col = matrix[0].length - 1;
            int t = (max_row + 1) * (max_col + 1);
            int c = 0;
            List<Integer> a = new ArrayList<>();
            while (c < t) {
                for (int i = min_col; i <= max_col && c < t; i++) {
                    a.add(matrix[min_row][i]);
                    c++;
                }
                min_row++;
                for (int i = min_row; i <= max_row && c < t; i++) {
                    a.add(matrix[i][max_col]);
                    c++;
                }
                max_col--;
                for (int i = max_col; i >= min_col && c < t; i--) {
                    a.add(matrix[max_row][i]);
                    c++;
                }
                max_row--;
                for (int i = max_row; i >= min_row && c < t; i--) {
                    a.add(matrix[i][min_col]);
                    c++;
                }
                min_col++;
            }
            return a;
        }
    }
}
