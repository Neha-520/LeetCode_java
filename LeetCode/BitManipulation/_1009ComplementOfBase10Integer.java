public class _1009ComplementOfBase10Integer {
    class Solution {
        public int bitwiseComplement(int n) {
            return n == 0 ? 1 : ~n & Integer.highestOneBit(n) - 1;
        }
    }
}
