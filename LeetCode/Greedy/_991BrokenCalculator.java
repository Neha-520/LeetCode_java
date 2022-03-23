public class _991BrokenCalculator {
    class Solution {
        public int brokenCalc(int start, int target) {
            if (start >= target)
                return start - target;
            int c = 0;
            while (target > start) {
                c++;
                if (target % 2 == 1)
                    target++;
                else
                    target /= 2;
            }
            return c + start - target;
        }
    }
}
