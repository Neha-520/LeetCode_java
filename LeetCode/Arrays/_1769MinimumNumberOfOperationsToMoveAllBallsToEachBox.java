public class _1769MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    class Solution {
        public int[] minOperations(String boxes) {
            if (boxes == null || boxes.length() == 0)
                return new int[] {};
            int n = boxes.length();

            int[] left = new int[n];
            int[] right = new int[n];
            int[] result = new int[n];

            int balls = boxes.charAt(0) == '1' ? 1 : 0;
            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] + 1 * balls;
                balls += boxes.charAt(i) == '1' ? 1 : 0;
            }

            balls = boxes.charAt(n - 1) == '1' ? 1 : 0;
            for (int i = n - 2; i >= 0; i--) {
                right[i] = right[i + 1] + 1 * balls;
                balls += boxes.charAt(i) == '1' ? 1 : 0;
            }

            for (int i = 0; i < n; i++)
                result[i] = left[i] + right[i];

            return result;
        }
    }

    // Prute - force ---------------------------
    class Solution {
        public int[] minOperations(String boxes) {
            boolean[] b = new boolean[boxes.length()];
            for (int i = 0; i < boxes.length(); i++) {
                if (boxes.charAt(i) == '1')
                    b[i] = true;
            }
            int res[] = new int[b.length];
            for (int i = 0; i < res.length; i++) {
                int sum = 0;
                for (int j = 0; j < b.length; j++) {
                    if (j == i)
                        continue;
                    if (b[j])
                        sum += Math.abs(j - i);
                }
                res[i] = sum;
            }
            return res;
        }
    }
}
