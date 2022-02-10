public class _1476SubrectangleQueries {
    class SubrectangleQueries {
        int[][] r;

        public SubrectangleQueries(int[][] rectangle) {
            r = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (int i = row1; i <= row2; i++) {
                for (int j = col1; j <= col2; j++) {
                    r[i][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return r[row][col];
        }
    }

}
