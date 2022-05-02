public class _1910RemoveAllOccurencesOfString {
    class Solution {
        public String removeOccurrences(String s, String part) {
            int c = s.indexOf(part);
            while (c >= 0) {
                s = s.substring(0, c) + s.substring(c + part.length());
                c = s.indexOf(part);
            }
            return s;
        }
    }
}
