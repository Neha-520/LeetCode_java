package String;

public class _848ShiftingLetters {
    class Solution {
        public String shiftingLetters(String s, int[] shifts) {
            char a[] = s.toCharArray();
            int shift = 0;
            for (int i = a.length - 1; i >= 0; i--) {
                shift = (shift + shifts[i]) % 26;
                a[i] = (char) (((a[i] - 'a' + shift) % 26) + 'a');
            }
            return new String(a);
        }
    }
}
