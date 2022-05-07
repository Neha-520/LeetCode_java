public class _456__132Pattern {
    class Solution {
        public boolean find132pattern(int[] nums) {
            if (nums.length < 3)
                return false;
            Stack<Integer> st = new Stack<>();
            int secondMax = Integer.MIN_VALUE;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] < secondMax)
                    return true;
                while (!st.isEmpty() && st.peek() < nums[i]) {
                    secondMax = Math.max(secondMax, st.pop());
                }
                st.push(nums[i]);
            }
            return false;
        }
    }
}
