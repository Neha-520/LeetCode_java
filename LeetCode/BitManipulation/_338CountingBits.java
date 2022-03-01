public class _338CountingBits {

    class Solution2 {
        public int[] countBits(int n) {
            int[] a = new int[n + 1];
            for (int x = 0; x <= n; x++) {
                int temp = x;
                while (temp > 0) {
                    a[x] += temp & 1;
                    temp >>= 1;
                }
            }
            return a;
        }
    }

    class Solution {
        public int[] countBits(int num) {
            int[] f = new int[num + 1];
            for (int i = 1; i <= num; i++)
                f[i] = f[i >> 1] + (i & 1);
            return f;
        }
    }

}
