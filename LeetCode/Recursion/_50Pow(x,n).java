public class _50Pow {
    class Solution {
        public double myPow(double x, int n) {
            if (n == 0)
                return 1;
            if (n < 0)
                return x * myPow(1.0 / x, Math.abs(n - 1));
            if (n % 2 == 0)
                return x * myPow(x, n - 1);
            else
                return x * myPow(x * x, n / 2);
        }

        class Solution2 {
            public double myPow(double x, int n) {
                double answer = 1;
                long nn = n;
                if (nn < 0)
                    nn = (-1) * nn;
                while (nn > 0) {
                    if (nn % 2 == 1) {
                        answer *= x;
                        nn -= 1;
                    } else {
                        x *= x;
                        nn /= 2;
                    }
                }
                if (n < 0)
                    answer = 1.0 / answer;
                return answer;
            }
        }
    }
}
