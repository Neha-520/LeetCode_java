package Matrix;

public class _74Search2DMatrix {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++) {
                if (target > matrix[i][matrix[i].length - 1])
                    continue;
                int l = 0, r = matrix[i].length - 1;
                while (l <= r) {
                    int mid = l + (r - l) / 2;
                    if (matrix[i][mid] == target)
                        return true;
                    else if (matrix[i][mid] > target)
                        r = mid - 1;
                    else
                        l = mid + 1;
                }
            }
            return false;
        }
    }
}
