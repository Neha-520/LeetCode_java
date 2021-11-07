public class _43MultiplyStrings {
    class Solution {
        public String multiply(String num1, String num2) {
            if (num1.equals("0") || num2.equals("0") || num1.length() == 0 || num2.length() == 0)
                return "0";
            if (num1.equals("1"))
                return num2;
            if (num2.equals("1"))
                return num1;
            int[] res = new int[num1.length() + num2.length()];
            int product = 0;
            for (int i = num1.length() - 1; i >= 0; i--) {
                for (int j = num2.length() - 1; j >= 0; j--) {
                    product = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                    product += res[i + j + 1];
                    res[i + j + 1] = product % 10;
                    res[i + j] += product / 10;
                }
            }
            StringBuilder sb = new StringBuilder();
            for (int x : res) {
                if (sb.length() == 0 && x == 0)
                    continue;
                sb.append(x);
            }
            return sb.toString();
        }
    }
}
