public class _1663SmallestStringWithGivenNumericValues {
    class Solution2 {
        public String getSmallestString(int n, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = n - 1; i >= 0; i--) {
                int x = Math.min(26, k - i);
                sb.append((char) (x - 1 + 'a'));
                k -= x;
            }
            return sb.reverse().toString();
        }
    }

    class Solution {
        public String getSmallestString(int n, int k) {
            char ans[] = new char[n];
            int i = 0;
            while (i < n) {
                ans[i] = 'a';
                i++;
            }
            k = k - n;
            int j = n - 1;
            while (k > 0) {
                if (k < 25) {
                    ans[j] = (char) ('a' + k);
                    k = 0;
                } else {
                    ans[j] = 'z';
                    k -= 25;
                }
                j--;
            }
            return new String(ans);
        }
    }
}
