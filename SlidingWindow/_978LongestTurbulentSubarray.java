package SlidingWindow;

public class _978LongestTurbulentSubarray {
    class Solution {
        public int maxTurbulenceSize(int[] A) {
            int max = 0, c = 0;
            for (int i = 0; i < A.length; i++) {
                if (i >= 2 && ((A[i - 2] > A[i - 1] && A[i - 1] < A[i]) || (A[i - 2] < A[i - 1] && A[i - 1] > A[i])))
                    c += 1;
                else if (i >= 1 && A[i - 1] != A[i])
                    c = 2;
                else
                    c = 1;
                max = Math.max(max, c);
            }
            return max;
        }
    }
}
