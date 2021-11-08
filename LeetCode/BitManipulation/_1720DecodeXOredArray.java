public class _1720DecodeXOredArray {
    class Solution {
        public int[] decode(int[] encoded, int first) {
            int[] a = new int[encoded.length + 1];
            a[0] = first;
            for (int i = 0; i < encoded.length; i++) {
                a[i + 1] = a[i] ^ encoded[i];
            }
            return a;
        }
    }
}
