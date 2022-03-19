public class _1750MinimumLengthOfStringAfterDeletingSimilarEnds {

    // optimized
    class Solution {
        public int minimumLength(String s) {
            int i = 0, j = s.length() - 1;
            if (s.length() == 1)
                return 1;
            char c = ' ';
            int x = s.length();
            while (i < j) {
                if (s.charAt(i) == s.charAt(j)) {
                    c = s.charAt(i);
                    while (i < j && s.charAt(i) == c) {
                        i++;
                        x--;
                    }
                    while (j >= i && s.charAt(j) == c) {
                        j--;
                        x--;
                    }
                } else
                    break;
            }
            return x;
        }
    }

    class Solution2 {
        public int minimumLength(String s) {
            int i = 0, j = s.length() - 1;
            StringBuilder sb = new StringBuilder(s);
            if (s.length() == 1)
                return 1;
            char c = ' ';
            while (i <= j) {
                if (s.charAt(i) == s.charAt(j)) {
                    c = s.charAt(i);
                    while (s.charAt(i) == c) {
                        i++;
                        if (i == s.length())
                            return 0;
                    }
                    while (s.charAt(j) == c) {
                        j--;
                    }
                    if (i < (j + 1))
                        sb = new StringBuilder(s.substring(i, j + 1));
                } else
                    break;
            }
            String x = sb.toString();
            if (sb.reverse().toString().equals(x) && x.length() != 1)
                return 0;
            return x.length();
        }
    }
}
