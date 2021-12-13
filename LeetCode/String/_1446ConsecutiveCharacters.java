public class _1446ConsecutiveCharacters {
    class Solution {
        public int maxPower(String s) {
            if (s.length() == 1)
                return 1;
            int max = 0, c = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) == s.charAt(i))
                    c++;
                else
                    c = 1;
                max = Math.max(max, c);
            }
            return max;
        }
    }
}
