public class _1962RemoveStonesToMinimizeTotal {
    class Solution {
        public int minStoneSum(int[] piles, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
            int sum = 0;
            for (int n : piles) {
                pq.add(n);
                sum += n;
            }
            while (k-- > 0) {
                int a = pq.remove();
                int c = (int) Math.floor(a / 2);
                sum -= c;
                pq.add(a - c);
            }
            return sum;
        }
    }
}
