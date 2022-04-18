public class _1652DefuseTheBomb {
    class Solution {
        public int[] decrypt(int[] code, int k) {
            int[] x = new int[code.length];
            int c = k;
            if (k == 0)
                return x;
            if (k > 0) {
                for (int i = 0; i < code.length; i++) {
                    c = k;
                    int j = i + 1;
                    while (c-- > 0) {
                        if (j == code.length)
                            j = 0;
                        x[i] += code[j++];
                    }
                }
            } else {
                for (int i = 0; i < code.length; i++) {
                    c = k;
                    int j = i - 1;
                    while (c++ != 0) {
                        if (j < 0)
                            j = code.length - 1;
                        x[i] += code[j--];
                    }
                }
            }
            return x;
        }
    }
}
