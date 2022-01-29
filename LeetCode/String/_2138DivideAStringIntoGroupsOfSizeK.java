public class _2138DivideAStringIntoGroupsOfSizeK {
    class Solution {
        public String[] divideString(String s, int k, char fill) {
            String a[];
            if (s.length() % k == 0)
                a = new String[(s.length() / k)];
            else
                a = new String[(s.length() / k) + 1];
            int index = 0;
            for (int i = 0; i < s.length(); i += k) {
                if ((i + k) > s.length() - 1)
                    a[index++] = s.substring(i, s.length());
                else
                    a[index++] = s.substring(i, i + k);
            }
            int c = k - a[a.length - 1].length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c; i++)
                sb.append(fill);
            a[a.length - 1] = a[a.length - 1] + sb.toString();
            return a;
        }
    }
}
