public class _541ReverseStringII {
    class Solution {
        public String reverseStr(String s, int k) {
            char[] temp = s.toCharArray();
            for (int st = 0; st < s.length(); st += 2 * k) {
                int i = st, j = Math.min(st + k - 1, s.length() - 1);
                while (i < j) {
                    char c = temp[i];
                    temp[i++] = temp[j];
                    temp[j--] = c;
                }
            }
            return new String(temp);
        }
    }
}
