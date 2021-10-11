public class _201BitwiseANDofNumbersRange {
    class Solution {
        public int rangeBitwiseAnd(int left, int right) {

            for (int i = right - 1; i >= left; i--) {

                right = right & i;
                i = right;
            }
            return right;
        }
    }
}
