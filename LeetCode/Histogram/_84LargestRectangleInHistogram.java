public class _84LargestRectangleInHistogram {
    class Solution {
        public int largestRectangleArea(int[] heights) {
            int[] rb = new int[heights.length];
            Stack<Integer> s = new Stack<>();
            s.push(heights.length - 1);
            rb[heights.length - 1] = heights.length;

            for (int i = heights.length - 2; i >= 0; i--) {
                while (s.size() > 0 && heights[i] <= heights[s.peek()]) {
                    s.pop(); // when you get bigger value pop
                }
                if (s.size() == 0)
                    rb[i] = heights.length;
                else
                    rb[i] = s.peek();
                s.push(i);
            }

            int[] lb = new int[heights.length];
            s = new Stack<>();
            s.push(0);
            lb[0] = -1;

            for (int i = 1; i < heights.length; i++) {
                while (s.size() > 0 && heights[i] <= heights[s.peek()]) {
                    s.pop(); // when you get bigger value pop
                }
                if (s.size() == 0)
                    lb[i] = -1;
                else
                    lb[i] = s.peek();
                s.push(i);
            }
            int maxArea = 0;
            for (int i = 0; i < heights.length; i++) {
                int width = rb[i] - lb[i] - 1;
                int area = heights[i] * width;
                maxArea = Math.max(area, maxArea);
            }
            return maxArea;
        }
    }
}
