public class _2148CountElementsWithStrictlySmallerAndGreaterElements {
    class Solution {
        public int countElements(int[] nums) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int i : nums) {
                max = Math.max(max, i);
                min = Math.min(min, i);
            }
            int c = 0;
            for (int i : nums) {
                if (i > min && i < max)
                    c++;
            }
            return c;
        }
    }
}
