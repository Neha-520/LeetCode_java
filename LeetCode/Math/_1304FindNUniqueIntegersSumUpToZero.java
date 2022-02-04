public class _1304FindNUniqueIntegersSumUpToZero {
    class Solution {
        public int[] sumZero(int n) {
            int a[] = new int[n];
            int i = 0, j = n / 2, k = 1;
            while (i != n / 2) {
                a[i++] = k;
                a[j++] = (-1) * k;
                k++;
            }
            return a;
        }
    }
}
