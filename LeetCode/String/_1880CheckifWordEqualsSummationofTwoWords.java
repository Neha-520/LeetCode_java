package String;

public class _1880CheckifWordEqualsSummationofTwoWords {
    class Solution {
        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            return fun(firstWord) + fun(secondWord) == fun(targetWord);
        }

        int fun(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++)
                sb.append((int) (s.charAt(i) - 'a'));
            return Integer.parseInt(sb.toString());
        }
    }
}
