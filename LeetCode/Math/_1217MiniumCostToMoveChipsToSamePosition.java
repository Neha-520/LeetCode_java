public class _1217MiniumCostToMoveChipsToSamePosition {
    class Solution {
        public int minCostToMoveChips(int[] position) {
            int o = 0, e = 0;
            for (int i : position) {
                if (i % 2 == 0)
                    e++;
                else
                    o++;
            }
            return Math.min(o, e);
        }
    }
}
