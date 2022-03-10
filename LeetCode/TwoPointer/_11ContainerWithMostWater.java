public class _11ContainerWithMostWater {
    class Solution {
        public int maxArea(int[] height) {
            int i = 0, area = 0, j = height.length - 1, res = 0;
            while (i < j) {
                if (height[i] <= height[j]) {
                    res = height[i] * (j - i);
                    i++;
                } else {
                    res = height[j] * (j - i);
                    j--;
                }
                area = Math.max(area, res);
            }
            return area;
        }
    }
}
