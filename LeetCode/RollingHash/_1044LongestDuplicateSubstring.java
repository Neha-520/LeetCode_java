//rabin karp algo 
// sliding window
public class _1044LongestDuplicateSubstring {
    class Solution {
        public String longestDupSubstring(String s) {
            int l = 1;
            int r = s.length() - 1;

            String res = "";
            while (l <= r) {
                int mid = l + (r - l) / 2;
                String str = rabinKarp(s, mid);
                if (str.length() != 0) {
                    res = str;
                    l = mid + 1;
                } else
                    r = mid - 1;
            }
            return res;
        }

        public String rabinKarp(String s, int len) {
            Set<Long> set = new HashSet<>();
            long h = hash(s.substring(0, len));
            set.add(h);
            long pow = 1;
            for (int i = 1; i < len; i++)
                pow *= 31;
            for (int j = 1; j <= s.length() - len; j++) {
                h = nextHash(pow, h, s.charAt(j - 1), s.charAt(j + len - 1));
                if (set.contains(h))
                    return s.substring(j, j + len);
                set.add(h);
            }
            return "";
        }

        private long nextHash(long pow, long hash, char left, char right) {
            return (hash - left * pow) * 31 + right;
        }

        long hash(String s) {
            long hash = 0;
            long mul = 1;
            for (int i = s.length() - 1; i >= 0; i--) {
                hash += s.charAt(i) * mul;
                mul *= 31;
            }
            return hash;
        }

    }
}
