public class _2243CalculateDigitSumOfString {
    class Solution {
        public String digitSum(String s, int k) {
            StringBuilder ans = new StringBuilder(s);
            while (ans.length() > k) {
                StringBuilder dummy = new StringBuilder();
                int i = 0;
                for (i = 0; i < ans.length(); i += k) {
                    int sum = 0;
                    for (int j = 0; j < k && (j + i) < ans.length(); j++) {
                        sum += ans.charAt(i + j) - '0';
                    }
                    dummy.append(sum + "");
                }
                ans = dummy;
            }
            return ans.toString();
        }
    }
}
