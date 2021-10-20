package Math;

public class _224BasicCalculator {
    class Solution {
        int i = 0;

        public int calculate(String s) {
            if (s == null || s.length() == 0)
                return 0;
            int tmp = 0, sign = 1, result = 0;
            while (i < s.length()) {
                char c = s.charAt(i++);
                if (Character.isDigit(c))
                    tmp = tmp * 10 + c - '0';
                else if (c == '(')
                    tmp = calculate(s);
                else if (c == ')')
                    break;
                else if (c == '+' || c == '-') {
                    result += sign * tmp;
                    tmp = 0;
                    sign = (c == '+') ? 1 : -1;
                }
            }
            result += sign * tmp;
            return result;
        }
    }
}
