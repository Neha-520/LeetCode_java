package TwoPointer;

public class _917ReverseOnlyLetters {
    class Solution {
        public String reverseOnlyLetters(String s) {
            char[] x = s.toCharArray();
            int i = 0, j = x.length - 1;
            while (i < j) {
                if (Character.isAlphabetic(x[i]) && Character.isAlphabetic(x[j]))
                    swap(x, i, j);
                else if (!Character.isAlphabetic(x[i])) {
                    i++;
                    continue;
                } else {
                    j--;
                    continue;
                }
                i++;
                j--;
            }
            return String.valueOf(x);
        }

        void swap(char[] x, int i, int j) {
            char temp = x[i];
            x[i] = x[j];
            x[j] = temp;
        }
    }
}
