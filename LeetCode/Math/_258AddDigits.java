package Math;

public class _258AddDigits {
    class Solution {
        public int addDigits(int num) {
            if (num < 9)
                return num;
            int sum = num, a = num;
            while (sum > 9) {
                sum = 0;
                while (a > 0) {
                    sum += a % 10;
                    a /= 10;
                }
                a = sum;
            }
            return sum;
        }
    }

    class Solution {
        public int addDigits(int num) {
            if (num == 0)
                return 0;
            if (num % 9 == 0)
                return 9;
            return num % 9;
        }
    }
}
