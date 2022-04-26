public class _519RandomFlipMatrix {
    // modern method of the Fisher–Yates shuffle.
    class Solution {
        private Map<Integer, Integer> map;
        private int rows, cols, total;
        private Random rand;

        public Solution(int n_rows, int n_cols) {
            map = new HashMap<>();
            rand = new Random();
            rows = n_rows;
            cols = n_cols;
            total = rows * cols;
        }

        public int[] flip() {
            // generate index, decrease total number of values
            int r = rand.nextInt(total--);
            // check if we have already put something at this index
            int x = map.getOrDefault(r, r);

            // swap - put total at index that we generated
            map.put(r, map.getOrDefault(total, total));
            return new int[] { x / cols, x % cols };
        }

        public void reset() {
            map.clear();
            total = rows * cols;
        }
    }

    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(m, n);
     * int[] param_1 = obj.flip();
     * obj.reset();
     */
}
