public class _91DecodeWays {
    class Solution {
        public int numDecodings(String s) {
            if (s.charAt(0) == '0')
                return 0;
            int a[] = new int[s.length() + 1];
            a[0] = 1;
            a[1] = 1;
            for (int i = 2; i <= s.length(); i++) {
                int oneDigit = Integer.valueOf(s.substring(i - 1, i));
                int twoDigit = Integer.valueOf(s.substring(i - 2, i));
                if (oneDigit >= 1)
                    a[i] += a[i - 1];
                if (twoDigit >= 10 && twoDigit <= 26)
                    a[i] += a[i - 2];
            }
            return a[s.length()];
        }
    }
}
