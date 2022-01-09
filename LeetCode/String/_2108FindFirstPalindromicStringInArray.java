public class _2108FindFirstPalindromicStringInArray {
    class Solution {
        public String firstPalindrome(String[] words) {
            for (String i : words) {
                StringBuilder sb = new StringBuilder(i);
                if (sb.reverse().toString().equals(i))
                    return i;
            }
            return "";
        }
    }
}
