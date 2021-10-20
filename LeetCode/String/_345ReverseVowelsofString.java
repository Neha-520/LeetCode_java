package String;

public class _345ReverseVowelsofString {
    class Solution {
        public String reverseVowels(String s) {
            char ary[] = s.toCharArray();
            int i = 0, j = ary.length - 1;
            while (i < j) {
                if (checkVowel(ary[i]) == 0) {
                    i++;
                    continue;
                }
                if (checkVowel(ary[j]) == 0) {
                    j--;
                    continue;
                }
                char temp = ary[i];
                ary[i] = ary[j];
                ary[j] = temp;
                i++;
                j--;
            }

            return new String(ary);
        }

        static int checkVowel(char c) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    return 1;
            }
            return 0;
        }
    }
}
