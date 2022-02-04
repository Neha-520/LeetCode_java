public class _263UglyNumber {
    class Solution {
        public boolean isUgly(int n) {
            if (n == 1)
                return true;
            if (n == 0)
                return false;
            int x;
            x = helper(n, 2);
            if (x >= 3)
                x = helper(x, 3);
            if (x >= 5)
                x = helper(x, 5);
            if (x == 1 || x == 0)
                return true;
            return false;
        }

        int helper(int x, int y) {
            while (x % y == 0)
                x = x / y;
            return x;
        }
    }
}
