public class _2279MaximumBagsWithFullCapacityOfRocks {
    class Solution {
        public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
            for (int i = 0; i < rocks.length; i++) {
                rocks[i] = capacity[i] - rocks[i];
            }
            Arrays.sort(rocks);
            int ans = 0, j = 0;
            while (additionalRocks > 0) {
                if (j >= rocks.length || rocks[j] > additionalRocks)
                    break;
                ans++;
                additionalRocks -= rocks[j++];
            }
            return ans;
        }
    }
}
