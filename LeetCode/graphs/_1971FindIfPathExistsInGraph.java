public class _1971FindIfPathExistsInGraph {
    class Solution {
        public boolean validPath(int n, int[][] edges, int start, int end) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++)
                adj.add(new ArrayList<>());
            for (int[] edge : edges) {
                adj.get(edge[0]).add(edge[1]);
                adj.get(edge[1]).add(edge[0]);
            }
            Queue<Integer> q = new LinkedList<>();
            boolean[] vis = new boolean[n];
            q.add(start);
            vis[start] = true;
            while (!q.isEmpty()) {
                int currVertex = q.peek();
                for (int i = 0; i < adj.get(currVertex).size(); i++) {
                    int secondVertex = adj.get(currVertex).get(i);
                    if (!vis[secondVertex]) {
                        q.offer(secondVertex);
                        vis[secondVertex] = true;
                    }
                }
                q.remove(currVertex);
            }
            if (vis[end])
                return true;
            return false;
        }
    }
}
