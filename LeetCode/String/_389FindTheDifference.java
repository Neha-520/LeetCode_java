public class _389FindTheDifference {
    class Solution {
        public char findTheDifference(String s, String t) {

            int sum1 = 0;
            for (int i = 0; i < s.length(); i++) {
                sum1 += s.charAt(i);
            }
            for (int i = 0; i < t.length(); i++) {
                sum1 -= t.charAt(i);
            }
            return (char) (Math.abs(sum1));
        }
    }
}
