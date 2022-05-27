public class _547NumberOfProvinces {
    class Solution {
        public int findCircleNum(int[][] isConnected) {
            boolean[] vis = new boolean[isConnected.length];
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            int c = 0, z = 0;
            for (int i = 0; i < isConnected.length; i++)
                adj.add(new ArrayList<Integer>());
            for (int[] x : isConnected) {
                for (int j = 0; j < x.length; j++) {
                    if (x[j] == 1)
                        adj.get(z).add(j);
                }
                z++;
            }
            for (int i = 0; i < adj.size(); i++) {
                if (!vis[i]) {
                    c++;
                    bfs(adj, i, vis);
                }
            }
            return c;
        }

        public void bfs(ArrayList<ArrayList<Integer>> adj, int node, boolean vis[]) {
            Queue<Integer> q = new LinkedList<>();
            q.add(node);
            while (!q.isEmpty()) {
                int x = q.poll();
                for (int y : adj.get(x)) {
                    if (!vis[y]) {
                        vis[y] = true;
                        q.add(y);
                    }
                }
            }
        }
    }
}
