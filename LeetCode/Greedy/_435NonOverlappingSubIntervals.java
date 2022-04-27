public class _435NonOverlappingSubIntervals {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

            int count = 0;
            int[] prev = intervals[0];
            for (int i = 1; i < intervals.length; i++) {
                if (prev[1] > intervals[i][0]) {
                    prev[1] = Math.min(prev[1], intervals[i][1]);
                    count++;
                } else
                    prev = intervals[i];
            }
            return count;
        }
    }

    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            int res = 0;
            ArrayList<int[]> l = new ArrayList<>();
            l.add(intervals[0]);
            int i = 0, j = 0;
            for (int[] x : intervals) {
                if (j == 0) {
                    j++;
                    continue;
                }
                int y[] = l.get(i);
                if (y[1] > x[0]) {
                    y[1] = Math.min(y[1], x[1]);
                    res++;
                } else {
                    l.add(x);
                    i++;
                }
            }
            return res;
        }
    }
}
