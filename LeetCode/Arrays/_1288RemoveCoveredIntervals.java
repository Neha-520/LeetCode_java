public class _1288RemoveCoveredIntervals {
    class Solution {
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
