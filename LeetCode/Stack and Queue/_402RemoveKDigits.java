public class _402RemoveKDigits {
    class Solution {
        public String removeKdigits(String num, int k) {
            if (k >= num.length())
                return "0";
            Stack<Integer> s = new Stack<>();
            int d = 0;
            for (int i = 0; i < num.length() && k > 0;) {
                while (k > 0 && !s.isEmpty() && s.peek() > Integer.parseInt(String.valueOf(num.charAt(i)))) {
                    s.pop();
                    k--;
                }
                s.push(Integer.parseInt(String.valueOf(num.charAt(i))));
                i++;
                d = i;
            }
            StringBuilder sb = new StringBuilder();
            while (!s.isEmpty() && k > 0) {
                s.pop();
                k--;
            }
            while (!s.isEmpty()) {
                sb.append(s.pop());
            }
            sb.reverse();
            sb.append(num.substring(d, num.length()));
            String r = sb.toString();
            int i = 0;
            while (i < r.length()) {
                if (r.charAt(i) == '0')
                    i++;
                else
                    break;
            }
            if (r.substring(i).length() == 0)
                return "0";
            return r.substring(i);
        }
    }
}
