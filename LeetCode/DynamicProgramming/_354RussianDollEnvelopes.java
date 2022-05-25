public class _354RussianDollEnvelopes {
    class Solution {
        public int maxEnvelopes(int[][] envelopes) {
            if (envelopes == null || envelopes.length == 0 || envelopes[0] == null || envelopes[0].length == 0)
                return 0;
            Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
            TreeSet<Integer> LIS = new TreeSet();
            LIS.add(envelopes[0][1]);
            for (int i = 1; i < envelopes.length; i++) {
                Integer key = LIS.ceiling(envelopes[i][1]);
                if (key != null)
                    LIS.remove(key);
                LIS.add(envelopes[i][1]);
            }
            return LIS.size();
        }
    }
}
