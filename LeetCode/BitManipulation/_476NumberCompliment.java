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
}
