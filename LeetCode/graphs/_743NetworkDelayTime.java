public class _743NetworkDelayTime {
    class Solution {
        public int networkDelayTime(int[][] times, int n, int k) {
            ArrayList<ArrayList<Pair<Integer, Integer>>> adj = new ArrayList<>();
            for (int i = 0; i < n + 1; i++)
                adj.add(new ArrayList<>());
            for (int[] t : times) {
                adj.get(t[0]).add(new Pair<>(t[1], t[2]));
            }
            int c = 0;
            Queue<Pair<Integer, Integer>> q = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
            q.add(new Pair<>(k, 0));
            int[] dis = new int[n + 1];
            Arrays.fill(dis, Integer.MAX_VALUE);
            dis[0] = 0;
            dis[k] = 0;
            while (!q.isEmpty()) {
                Pair<Integer, Integer> curr = q.poll();
                for (Pair<Integer, Integer> p : adj.get(curr.getKey())) {
                    if (p.getValue() + dis[curr.getKey()] < dis[p.getKey()]) {
                        dis[p.getKey()] = p.getValue() + dis[curr.getKey()];
                        q.add(p);
                    }
                }
            }
            for (int d : dis) {
                c = Math.max(c, d);
            }
            return c == Integer.MAX_VALUE ? -1 : c;
        }
    }
}
