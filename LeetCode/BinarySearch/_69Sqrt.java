public @interface _69Sqrt {
    class Solution {
        public int mySqrt(int x) {
            if (x < 2)
                return x;
            int low = 0, high = x / 2, result = 0;
            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (mid * mid <= x) {
                    result = (int) mid;
                    low = (int) mid + 1;
                } else
                    high = (int) mid - 1;
            }
            return result;
        }
    }
}
