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

    class Solution2 {
        public int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int maxArea = 0;
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i <= n; i++) {
                int currHeight = i == n ? 0 : heights[i];
                // check if currHeight becomes greater then height[top] element of stack. we do
                // a push because it's an increasing sequence
                // otherwise we do pop and find area, so for that we write a while loop
                while (!st.isEmpty() && currHeight < heights[st.peek()]) {
                    int top = st.pop(); // current element on which we are working
                    // now we need width & area
                    int width = st.isEmpty() ? i : i - st.peek() - 1; // width differ, if stack is empty or not empty
                                                                      // after we pop the element
                    int area = heights[top] * width; // current height * width
                    maxArea = Math.max(area, maxArea);
                }
                // if it doesn't enter in while loop, it means it's an increasing sequence & we
                // need to push index
                st.push(i);
            }
            return maxArea;
        }
    }
}
