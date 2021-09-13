package DynamicProgramming;

import java.util.Arrays;

public class _764LasrgestPlusSign {
    class Solution {
        public int orderOfLargestPlusSign(int n, int[][] mines) {
            int[][] grid = new int[n][n];
            for (int[] row : grid) {
                Arrays.fill(row, 1);
            }
            for (int[] mine : mines) {

                grid[mine[0]][mine[1]] = 0;
            }

            int[][] lTR = new int[n][n];

            for (int i = 0; i < n; i++) {
                int runningSum = 0;
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 0)
                        runningSum = 0;
                    else
                        runningSum += grid[i][j];
                    lTR[i][j] = runningSum;
                }
            }

            int[][] rTL = new int[n][n];
            for (int i = 0; i < n; i++) {
                int runningSum = 0;
                for (int j = n - 1; j >= 0; j--) {
                    if (grid[i][j] == 0)
                        runningSum = 0;
                    else
                        runningSum += grid[i][j];
                    rTL[i][j] = runningSum;
                }
            }

            int[][] tTB = new int[n][n];
            for (int i = 0; i < n; i++) {
                int runningSum = 0;
                for (int j = 0; j < n; j++) {
                    if (grid[j][i] == 0)
                        runningSum = 0;
                    else
                        runningSum += grid[j][i];
                    tTB[j][i] = runningSum;
                }
            }

            int[][] bTT = new int[n][n];
            for (int i = 0; i < n; i++) {
                int runningSum = 0;
                for (int j = n - 1; j >= 0; j--) {
                    if (grid[j][i] == 0)
                        runningSum = 0;
                    else
                        runningSum += grid[j][i];
                    bTT[j][i] = runningSum;
                }
            }
            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int minLen = Math.min(Math.min(lTR[i][j], rTL[i][j]), Math.min(bTT[i][j], tTB[i][j]));
                    ans = Math.max(ans, minLen);
                }
            }
            return ans;
        }
    }
}
