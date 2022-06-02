public class _29DivideTwoIntegers {
    class Solution {
        public int divide(int dividend, int divisor) {
            if (dividend == 1 << 31 && divisor == -1)
                return Integer.MAX_VALUE;
            boolean sign = (dividend >= 0) == (divisor >= 0) ? true : false;
            dividend = Math.abs(dividend);
            divisor = Math.abs(divisor);
            int res = 0;
            while (dividend - divisor >= 0) {
                int c = 0;
                while (dividend - (divisor << 1 << c) >= 0) {
                    c++;
                }
                res += 1 << c;
                dividend -= divisor << c;
            }
            return sign ? res : -res;
        }
    }
}
