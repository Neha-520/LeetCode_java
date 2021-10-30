public class _1299ReplaceElementswithGreatestElementtoRight {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int[] result = new int[arr.length];
            int maxValue = -1;
            for (int x = arr.length - 1; x >= 0; x--) {
                result[x] = maxValue;
                maxValue = Math.max(arr[x], maxValue);
            }
            return result;
        }
    }
}
