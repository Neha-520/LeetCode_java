package String;

public class _1309DecryptStringfromAlphabettoIntegerMapping {
    class Solution {
        public String freqAlphabets(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == '#') {
                    sb.append((char) (96 + Integer.valueOf(s.substring(i - 2, i))));
                    i = i - 2;
                } else
                    sb.append((char) (96 + (s.charAt(i) - '0')));
            }
            return sb.reverse().toString();
        }
    }
}
