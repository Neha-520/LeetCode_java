public class _1844ReplaceAllDigitsWithCharaters {
    class Solution {
        public String replaceDigits(String s) {
            char[] ch = s.toCharArray();
            for (int i = 1; i < ch.length; i += 2) {
                ch[i] = shift(ch[i - 1], Character.getNumericValue(ch[i]));
            }
            return String.valueOf(ch);
        }

        public char shift(char c, int x) {
            return (char) ((int) c + x);
        }
    }
}
