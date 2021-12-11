public class _878NthMagicalNumber {
    class Solution {
        public int nthMagicalNumber(int n, int a, int b) {
            long l = Math.min(a, b);
            long r = l * n;
            long lcm = (a * b) / gcd(a, b);
            long mid, factor;

            while (l < r) {
                mid = l + (r - l) / 2;
                factor = mid / a + mid / b - mid / lcm;
                if (factor < n)
                    l = mid + 1;
                else
                    r = mid;
            }
            int mod = (int) (Math.pow(10, 9) + 7);
            return (int) (l % mod);

        }

        public int gcd(int a, int b) {
            if (a == 0)
                return b;
            return gcd(b % a, a);
        }
    }

}
