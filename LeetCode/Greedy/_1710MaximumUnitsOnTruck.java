public class _1710MaximumUnitsOnTruck {
    class Solution {
        public int maximumUnits(int[][] boxTypes, int truckSize) {
            Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
            int i = 0, u = 0;
            for (int[] b : boxTypes) {
                if (b[0] <= truckSize) {
                    u += b[0] * b[1];
                    truckSize -= b[0];
                } else if (truckSize < b[0]) {
                    u += truckSize * b[1];
                    break;
                }
                if (truckSize == 0)
                    break;
            }
            return u;
        }
    }
}
