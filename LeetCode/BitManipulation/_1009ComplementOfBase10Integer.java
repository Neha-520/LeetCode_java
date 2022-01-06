public class _1009ComplementOfBase10Integer {
    class Solution {
        public int bitwiseComplement(int n) {
            return n == 0 ? 1 : ~n & Integer.highestOneBit(n) - 1;
        }
    }

    class Solution2 {
        public int bitwiseComplement(int n) {
            if (n == 0)
                return 1;
            int num = 0;
            int power = 1;
            while (n > 0) {
                int x = (n % 2 == 0) ? 1 : 0;
                n /= 2;
                num += x * power;
                power *= 2;
            }
            return num;
        }
    }
}
