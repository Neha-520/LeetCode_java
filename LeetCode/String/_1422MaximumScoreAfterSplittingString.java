public class _1422MaximumScoreAfterSplittingString {
    class Solution {
        public int maxScore(String s) {
            int max = 0;
            int count1 = 0;
            int count0 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1')
                    count1 += 1;
            }
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '0')
                    count0 += 1;
                else
                    count1--;
                int d = count0 + count1;
                max = Math.max(max, d);
            }
            return max;
        }
    }
}
