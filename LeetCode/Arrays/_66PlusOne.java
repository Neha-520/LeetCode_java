public class _66PlusOne {
    class Solution {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                } else
                    digits[i] = 0;

            }
            int[] a = new int[digits.length + 1];
            a[0] = 1;

            return a;
        }
    }
}
