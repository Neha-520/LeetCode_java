public class _2255CountPrefixesOfGivenString {
    class Solution {
        public int countPrefixes(String[] words, String s) {
            int c = 0;
            for (int i = 0; i < words.length; i++) {
                if (s.indexOf(words[i]) == 0)
                    c++;
            }
            return c;
        }
    }
}
