public class _441ArrangingCoins {
    class Solution {
        public int arrangeCoins(int n) {
            int completed = 0, rows = 1;
            while (rows <= n) {
                n = n - rows;
                rows++;
                completed++;
            }
            return completed;
        }
    }
}
