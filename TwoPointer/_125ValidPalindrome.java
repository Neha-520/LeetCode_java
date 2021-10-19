public class _125ValidPalindrome {
    class Solution {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                char c1 = s.charAt(left);
                char c2 = s.charAt(right);
                if (!Character.isLetterOrDigit(c1))
                    left++;
                else if (!Character.isLetterOrDigit(c2))
                    right--;
                else {
                    if (Character.toLowerCase(c1) != Character.toLowerCase(c2))
                        return false;
                    left++;
                    right--;
                }
            }
            return true;
        }
    }

    // 2nd soln
    public boolean isPalindrome2(String s) {
        String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String rev = new StringBuilder(actual).reverse().toString();
        return actual.equals(rev);
    }
}
