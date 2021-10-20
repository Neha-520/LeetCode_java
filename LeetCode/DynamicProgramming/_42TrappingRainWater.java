public class _42TrappingRainWater {
    class Solution {
        public int trap(int[] input) {
            if (input.length < 2)
                return 0;
            int outPutSum = 0;
            int n = input.length;
            int[] leftMax = new int[input.length];
            int[] rightMax = new int[input.length];

            leftMax[0] = input[0];
            // Left to Right Traversal
            for (int i = 1; i < input.length; i++) {
                leftMax[i] = Math.max(leftMax[i - 1], input[i]);
            }
            rightMax[n - 1] = input[n - 1];
            // Right to Left Traversal
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(rightMax[i + 1], input[i]);
                // Calculate the water trapped in each position
                outPutSum += Math.min(leftMax[i], rightMax[i]) - input[i];
            }
            return outPutSum;
        }
    }
}
