public class _275HIndexII {
    class Solution {
        public int hIndex(int[] citations) {
            int h_index = 0;
            for (int i = 0, j = citations.length - 1; i < citations.length; i++, j--) {
                if (citations[j] >= i + 1)
                    h_index++;
                else
                    break;
            }
            return h_index;
        }
    }
}
