public class _1854MaximumPopulationYear {
    class Solution {
        public int maximumPopulation(int[][] logs) {
            int[] year = new int[101];
            for (int[] x : logs) {
                year[x[0] - 1950]++;
                year[x[1] - 1950]--;
            }
            int maxNum = year[0], maxYear = 1950;
            for (int i = 1; i < year.length; i++) {
                year[i] += year[i - 1];
                if (year[i] > maxNum) {
                    maxNum = year[i];
                    maxYear = i + 1950;
                }
            }
            return maxYear;
        }
    }
}
