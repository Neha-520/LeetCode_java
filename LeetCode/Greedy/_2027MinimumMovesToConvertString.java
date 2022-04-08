public class _2027MinimumMovesToConvertString {
    class Solution {
        public int minimumMoves(String s) {
            if (!s.contains("X"))
                return 0;
            int m = 0;
            for (int i = 0; i < s.length();) {
                if (s.charAt(i) == 'O') {
                    i++;
                    continue;
                } else {
                    m++;
                    i += 3;
                }
            }
            return m;
        }
    }
}
