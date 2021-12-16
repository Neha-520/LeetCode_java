public class _310MinimumHeightTrees {
    class Solution {
        public List<Integer> findMinHeightTrees(int n, int[][] edges) {
            List<Integer> res = new ArrayList<>();

            if (n <= 0)
                return res;

            if (n == 1) {
                res.add(0);
                return res;
            }
            int degree[] = new int[n];
            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; i++)
                adj.add(new ArrayList<>());

            for (int e[] : edges) {
                degree[e[0]]++;
                degree[e[1]]++;
                adj.get(e[0]).add(e[1]);
                adj.get(e[1]).add(e[0]);
            }
            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                if (degree[i] == 1)
                    q.add(i);
            }

            while (n > 2) {
                int size = q.size();
                n -= size;
                while (size-- > 0) {
                    int v = q.poll();
                    for (int i : adj.get(v)) {
                        degree[i]--;
                        if (degree[i] == 1)
                            q.add(i);
                    }
                }
            }
            res.addAll(q);
            return res;
        }
    }
}
