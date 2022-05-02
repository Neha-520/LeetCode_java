public class _1833MaximumIceCreamBars {
    class Solution {
        public int maxIceCream(int[] costs, int coins) {
            int t = 0;
            Arrays.sort(costs);
            for (int n : costs) {
                if (coins >= n) {
                    t++;
                    coins -= n;
                }
            }
            return t;
        }
    }
}
