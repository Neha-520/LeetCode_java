public class _799ChampagneTower {
    class Solution {
        public double champagneTower(int poured, int query_row, int query_glass) {
            if (poured == 0)
                return 0;
            List<Double> l = new ArrayList<>();
            l.add(new Double(poured));
            while (query_row-- > 0) {
                List<Double> curr = new ArrayList<>();
                // to prevent -ve when glass cant be filled
                curr.add(Math.max(0, (l.get(0) - 1) / 2));
                for (int i = 1; i < l.size(); i++) {
                    curr.add(Math.max((l.get(i - 1) - 1) / 2, 0) + Math.max((l.get(i) - 1) / 2, 0));
                }
                curr.add(curr.get(0));
                l = new ArrayList<>(curr);
            }
            // min as 1 will be max value in it
            return Math.min(1, l.get(query_glass));
        }
    }
}
