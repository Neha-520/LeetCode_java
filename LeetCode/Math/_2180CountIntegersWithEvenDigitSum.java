public class _2180CountIntegersWithEvenDigitSum {
    class Solution {
        public int countEven(int num) {
            int c = 0;
            for (int n = 1; n <= num; n++) {
                int sum = 0;
                int temp = n;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (sum % 2 == 0)
                    c++;
            }
            return c;
        }
    }
}
