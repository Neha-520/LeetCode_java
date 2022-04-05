public class _447NumberOfBoomerangs {
    class Solution {
        public int numberOfBoomerangs(int[][] points) {
            HashMap<Double, Integer> hm = new HashMap<>();
            int res = 0;
            for (int[] a : points) {
                double d = 0;
                for (int[] b : points) {
                    d = Math.pow(b[1] - a[1], 2) + Math.pow(b[0] - a[0], 2);
                    hm.put(d, hm.getOrDefault(d, 0) + 1);
                }
                for (int v : hm.values())
                    res += v * (v - 1);
                hm.clear();
            }
            return res;
        }
    }
}
