public class _1502CanMakeArithmeticProgressionsfromSequence {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            if (arr.length < 3)
                return true;
            else {
                Arrays.sort(arr);
                for (int i = 2; i < arr.length; i++) {
                    if (arr[i] - arr[i - 1] != arr[i - 1] - arr[i - 2])
                        return false;
                }
            }
            return true;
        }
    }
}
