public class _455AssignCookies {
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int c = 0;
            for (int i = 0, j = 0; i < g.length && j < s.length;) {
                if (s[j] >= g[i]) {
                    c++;
                    i++;
                    j++;
                } else
                    j++;
            }
            return c;
        }
    }
}
