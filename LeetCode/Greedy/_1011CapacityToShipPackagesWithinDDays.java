public class _1011CapacityToShipPackagesWithinDDays {
    // Brute force
    class Solution {
        public int shipWithinDays(int[] weights, int days) {
            int x = 0;
            for (int item : weights)
                x = Math.max(item, x);
            while (true) {
                if (helper(weights, days, x))
                    return x;
                else
                    x++;
            }
        }

        boolean helper(int[] w, int days, int x) {
            int j = 0, s = 0;
            for (int i = 0; i < w.length;) {
                s = 0;
                while (s <= x && i < w.length && s + w[i] <= x) {
                    s += w[i++];
                }
                j++;
            }
            if (j <= days)
                return true;
            return false;
        }
    }
}
