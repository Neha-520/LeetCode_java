public class _1561MaximumNumberOfCoinsYouCanGet {
    class Solution {
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int sum = 0;
            int i = piles.length - 1, j = piles.length - 2, k = 0;
            while (k < j) {
                sum += piles[j];
                i -= 2;
                j -= 2;
                k++;
            }
            return sum;
        }
    }
}
