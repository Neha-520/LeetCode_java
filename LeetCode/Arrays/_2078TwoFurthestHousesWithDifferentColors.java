public class _2078TwoFurthestHousesWithDifferentColors {
    class Solution {
        public int maxDistance(int[] colors) {
            int size = colors.length - 1;
            for (int i = 0; i <= colors.length / 2; i++) {
                if ((colors[size] != colors[i]) || colors[0] != colors[size - i])
                    return size - i;
            }
            return -1;
        }
    }
}
