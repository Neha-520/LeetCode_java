public class _790DominoAndTrominoTiling {
    class Solution {
        public int numTilings(int n) {
            if (n < 3)
                return n;
            int mod = 1000000007;
            int[] arr = new int[n + 1];
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 5;

            for (int i = 4; i <= n; i++) {
                arr[i] = ((2 * arr[i - 1]) % mod + arr[i - 3] % mod) % mod;
            }
            return arr[n];
        }
    }
}
