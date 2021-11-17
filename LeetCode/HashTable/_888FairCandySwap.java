public class _888FairCandySwap {
    class Solution {
        public int[] fairCandySwap(int[] X, int[] Y) {
            Set<Integer> set = new HashSet<>();
            int sumX = 0;
            int sumY = 0;
            for (int i : X) {
                sumX += i;
                set.add(i);
            }
            for (int i : Y) {
                sumY += i;
            }
            for (int j : Y) {
                int temp = (sumX - sumY + 2 * j) / 2;
                if (set.contains(temp))
                    return new int[] { temp, j };
            }
            return new int[] { 0, 0 };
        }
    }
    /*
     * sumA + Y - X == sumB + X - Y sumA + 2Y - sumB = 2X X = (sumA - sumB + 2Y)/2
     * populate all the values of Array A in a set loop through all the values of
     * array B and calculate below formalu and check if the result exists in Array A
     * 
     */
}
