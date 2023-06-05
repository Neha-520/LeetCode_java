public class _1232CheckIfStraightLine {
    class Solution {
        public boolean checkStraightLine(int[][] coordinates) {
            int[] point1 = coordinates[0];
            int[] point2 = coordinates[1];

            // Calculate the slope between the first two points
            int deltaX = point2[0] - point1[0];
            int deltaY = point2[1] - point1[1];

            // Iterate through the remaining points
            for (int i = 2; i < coordinates.length; i++) {
                int[] currentPoint = coordinates[i];

                // Calculate the slope between the current point and the first point
                int currentDeltaX = currentPoint[0] - point1[0];
                int currentDeltaY = currentPoint[1] - point1[1];

                // If the slopes are not the same, return false
                if (deltaX * currentDeltaY != deltaY * currentDeltaX) {
                    return false;
                }
            }

            // All slopes are the same, so the points make a straight line
            return true;
        }
    }
}
