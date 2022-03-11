public class _2185CountingWordsWithGivenPrefix {
    class Solution {
        public int prefixCount(String[] words, String pref) {
            int c = 0;
            for (String s : words) {
                if (pref.length() > s.length())
                    continue;
                if (s.substring(0, pref.length()).equals(pref))
                    c++;
            }
            return c;
        }
    }

    class Solution2 {
        public int prefixCount(String[] words, String pref) {
            int c = 0;
            for (String x : words) {
                if (x.startsWith(pref))
                    c++;
            }
            return c;
        }
    }
}
