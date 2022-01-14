public class _452MinimumNumberOfArrowsToBurstBalloons {
    class Solution {
        public int findMinArrowShots(int[][] points) {
            if (points == null || points.length == 0)
                return 0;
            Arrays.sort(points, (int[] p1, int[] p2) -> {
                // Don't use p1[1 ] - p2[1]. It may overflow
                return p1[1] < p2[1] ? -1 : 1;
            });

            int end = points[0][1];
            int res = 1;
            for (int[] point : points) {
                if (point[0] <= end)
                    continue;
                res++;
                end = point[1];
            }
            return res;
        }
    }
}
