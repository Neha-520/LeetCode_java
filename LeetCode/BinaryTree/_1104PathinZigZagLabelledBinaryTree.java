public class _1104PathinZigZagLabelledBinaryTree {
    class Solution {
        public List<Integer> pathInZigZagTree(int n) {
            ArrayList<Integer> l = new ArrayList<>();
            int currentTotalVal = 0, lastLevelVal = 1;
            while (currentTotalVal < n) {
                currentTotalVal += lastLevelVal;
                lastLevelVal *= 2;
            }
            lastLevelVal /= 2;
            while (n != 1) {
                l.add(n);
                int compliment = 3 * lastLevelVal - n - 1;
                int parent = compliment / 2;
                n = parent;
                lastLevelVal /= 2;
            }
            l.add(1);
            Collections.reverse(l);
            return l;
        }
    }
}
