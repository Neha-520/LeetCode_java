public class _1615MaximalNetworkRank {
    class Solution {
        public int maximalNetworkRank(int n, int[][] roads) {
            int[] count = new int[n];
            boolean[][] directed = new boolean[n][n];

            for (int[] road : roads) {
                count[road[0]]++;
                count[road[1]]++;
                directed[road[0]][road[1]] = true;
                directed[road[1]][road[0]] = true;
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (directed[i][j])
                        max = Math.max(max, count[i] + count[j] - 1);
                    else
                        max = Math.max(max, count[i] + count[j]);
                }
            }
            return max;
        }
    }
}
