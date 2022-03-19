public class _983MinimumCostForTickets {
    class Solution {
        int[] T;

        public int mincostTickets(int[] days, int[] costs) {
            T = new int[days[days.length - 1]];
            Arrays.fill(T, -1);
            return helper(days, costs, 0, 0);
        }

        int helper(int[] days, int[] costs, int i, int finalValidDay) {
            if (i == days.length)
                return 0;
            // Here pass is still valid.
            if (days[i] <= finalValidDay) {
                return helper(days, costs, i + 1, finalValidDay);
            }
            // If we have the data in cache.
            if (T[i] != -1 && days[i] > finalValidDay)
                return T[i];
            // Since we are not covered with any previous day.
            // so we can take any of these 3 passes.
            int costOf1DayPass = costs[0] + helper(days, costs, i + 1, days[i]);
            int costOf7DayPass = costs[1] + helper(days, costs, i + 1, days[i] + 6);
            int costOfMonthPass = costs[2] + helper(days, costs, i + 1, days[i] + 29);

            return T[i] = Math.min(costOf1DayPass, Math.min(costOf7DayPass, costOfMonthPass));
        }
    }
}
