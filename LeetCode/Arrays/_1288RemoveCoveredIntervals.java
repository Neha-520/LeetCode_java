public class _1288RemoveCoveredIntervals {
    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]));
            int count = 0, cur = 0;
            for (int interval[] : intervals) {
                if (cur < interval[1]) {
                    cur = interval[1];
                    count++;
                }
            }
            return count;
        }
    }

    class Solution2 {
        public int removeCoveredIntervals(int[][] intervals) {
            List<int[]> Intervals = new ArrayList<>();

            for (int[] in : intervals)
                Intervals.add(in);
            Collections.sort(Intervals, (l1, l2) -> {
                if (l1[0] == l2[0])
                    return l2[1] - l1[1];
                else
                    return l1[0] - l2[0];
            });

            int index = 0;
            while (index < Intervals.size()) {
                int[] current = Intervals.get(index);
                int i = index + 1;
                while (i < Intervals.size()) {
                    if (Intervals.get(i)[1] <= current[1])
                        Intervals.remove(i);
                    else
                        break;
                }
                index++;
            }
            return Intervals.size();
        }
    }
}
