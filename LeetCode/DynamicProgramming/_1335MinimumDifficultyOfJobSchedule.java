public class _1335MinimumDifficultyOfJobSchedule {
    class Solution {
        int n, d;
        int[] hardestJobRemaining;
        int[][] memo;
        int[] jobDifficulty;

        public int minDifficulty(int[] jobDifficulty, int d) {
            n = jobDifficulty.length;

            if (n < d)
                return -1;

            hardestJobRemaining = new int[n];
            int hardestJob = 0;
            for (int i = n - 1; i >= 0; i--) {
                hardestJob = Math.max(hardestJob, jobDifficulty[i]);
                hardestJobRemaining[i] = hardestJob;
            }

            memo = new int[n][d + 1];
            for (int i = 0; i < n; i++) {
                Arrays.fill(memo[i], -1);
            }
            this.d = d;
            this.jobDifficulty = jobDifficulty;
            return dp(0, 1);
        }

        int dp(int i, int day) {
            if (day == d)
                return hardestJobRemaining[i];

            if (memo[i][day] == -1) {
                int best = Integer.MAX_VALUE;
                int hardest = 0;
                for (int j = i; j < n - (d - day); j++) {
                    hardest = Math.max(hardest, jobDifficulty[j]);

                    best = Math.min(best, hardest + dp(j + 1, day + 1));
                }
                memo[i][day] = best;
            }

            return memo[i][day];
        }
    }
}
