package String;

public class _8StringtoInteger {
    class Solution {
        public int myAtoi(String s) {
            s = s.trim();
            int result = 0;
            Boolean isNegative = false;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                Boolean isDigit = Character.isDigit(c);
                if (isDigit && c != 0) {
                    sb.append(c);
                } else if (!isDigit) {
                    if (i == 0 && (c == '-' || c == '+')) {
                        if (c == '-')
                            isNegative = true;
                        continue;
                    } else
                        break;
                }
            }
            String resultString = sb.toString();
            if (resultString.length() > 0) {
                try {
                    result = Integer.parseInt(resultString);
                    if (isNegative)
                        result *= -1;
                } catch (NumberFormatException e) {
                    if (isNegative)
                        result = Integer.MIN_VALUE;
                    else
                        result = Integer.MAX_VALUE;
                }
            }
            return result;
        }
    }
}
