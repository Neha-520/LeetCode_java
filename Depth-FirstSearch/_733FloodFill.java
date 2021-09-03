public class _733FloodFill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            if (image[sr][sc] == newColor)
                return image;
            fill(image, sr, sc, image[sr][sc], newColor);
            return image;
        }

        public void fill(int[][] image, int sr, int sc, int oldColor, int newColor) {
            if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || oldColor != image[sr][sc])
                return;
            image[sr][sc] = newColor;
            fill(image, sr - 1, sc, oldColor, newColor);
            fill(image, sr + 1, sc, oldColor, newColor);
            fill(image, sr, sc - 1, oldColor, newColor);
            fill(image, sr, sc + 1, oldColor, newColor);
        }
    }
}
