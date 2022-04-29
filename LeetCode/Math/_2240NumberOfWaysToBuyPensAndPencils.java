public class _2240NumberOfWaysToBuyPensAndPencils {
    class Solution {
        public long waysToBuyPensPencils(int total, int cost1, int cost2) {
            if (cost1 > total && cost2 > total)
                return 1;
            long sum = 0;
            int x = total / cost1;
            int i = 0;
            while (x-- >= 0) {
                int t = (total - i * cost1) / cost2;
                sum += t + 1;
                i++;
            }
            return sum;
        }
    }
}
