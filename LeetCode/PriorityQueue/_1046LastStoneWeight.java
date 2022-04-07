public class _1046LastStoneWeight {
    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b - a);
            for (int s : stones)
                p.add(s);
            while (!p.isEmpty()) {
                if (p.size() == 1)
                    return p.poll();
                int i = p.poll();
                int j = p.poll();
                if (i == j)
                    continue;
                else if (i > j)
                    p.add(i - j);
                else
                    p.add(j - i);
            }
            if (p.size() == 1)
                return p.poll();
            return 0;
        }
    }

}
