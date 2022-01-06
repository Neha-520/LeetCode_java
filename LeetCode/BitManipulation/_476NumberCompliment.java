public class _476NumberCompliment {
    class Solution {
        public int findComplement(int num) {
            int i = 0, j = 0;
            while (i < num) {
                i += Math.pow(2, j++);
            }
            return i - num;
        }
    }

    /// 2nd soln
    class Solution2 {
        public int findComplement(int num) {
            int m = 1 << (Integer.toBinaryString(num).length() - 1);
            m = m | m - 1;
            return num ^ m;
        }
    }

    // soln3
    class Solution3 {
        public int findComplement(int n) {
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
