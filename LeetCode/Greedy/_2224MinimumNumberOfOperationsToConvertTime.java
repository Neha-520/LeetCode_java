public class _2224MinimumNumberOfOperationsToConvertTime {
    class Solution {
        public int convertTime(String current, String correct) {
            int m1 = Integer.valueOf(current.substring(3)) + Integer.valueOf(current.substring(0, 2)) * 60;
            int m2 = Integer.valueOf(correct.substring(3)) + Integer.valueOf(correct.substring(0, 2)) * 60;
            int diff = m2 - m1;
            int[] arr = { 60, 15, 5, 1 };
            int r = 0;
            for (int i = 0; i < arr.length && diff > 0; i++) {
                r += diff / arr[i];
                diff %= arr[i];
            }
            return r;
        }
    }
}
