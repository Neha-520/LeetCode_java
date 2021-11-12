public class _567PermutationInString {
    class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length())
                return false;
            int a[] = new int[26];
            int b[] = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                a[s1.charAt(i) - 'a']++;
                b[s2.charAt(i) - 'a']++;
            }
            if (Arrays.equals(a, b))
                return true;
            int front = 0, back = s1.length();
            while (back < s2.length()) {
                b[s2.charAt(front) - 'a']--;
                b[s2.charAt(back) - 'a']++;
                if (Arrays.equals(a, b))
                    return true;
                front++;
                back++;
            }
            return false;
        }
    }
}
