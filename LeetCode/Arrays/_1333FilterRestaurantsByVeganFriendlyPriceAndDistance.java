public class _1333FilterRestaurantsByVeganFriendlyPriceAndDistance {
    class Solution {
        public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
            List<int[]> l = new ArrayList<>();
            List<Integer> res = new ArrayList<>();
            boolean flag = veganFriendly == 0 ? false : true;
            for (int[] r : restaurants) {
                if (flag) {
                    if (r[2] == veganFriendly && r[3] <= maxPrice && r[4] <= maxDistance)
                        l.add(new int[] { r[0], r[1] });
                } else {
                    if (r[3] <= maxPrice && r[4] <= maxDistance)
                        l.add(new int[] { r[0], r[1] });
                }
            }
            Collections.sort(l, (r1, r2) -> r1[1] == r2[1] ? r2[0] - r1[0] : r2[1] - r1[1]);
            for (int[] x : l) {
                res.add(x[0]);
            }
            return res;
        }
    }
}
