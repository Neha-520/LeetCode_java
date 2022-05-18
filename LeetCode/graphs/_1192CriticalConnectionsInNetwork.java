import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<List<Integer>>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());

        for (List<Integer> it : connections) {
            adj.get(it.get(0)).add(it.get(1));
            adj.get(it.get(1)).add(it.get(0));
        }
        boolean vis[] = new boolean[n];
        int tim[] = new int[n];
        int low[] = new int[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i])
                dfs(i, vis, tim, low, result, 0, adj, -1);
        }
        return result;
    }

    public void dfs(int node, boolean vis[], int tim[], int low[], List<List<Integer>> result,
            int timer, List<List<Integer>> adj, int parent) {
        vis[node] = true;
        tim[node] = low[node] = timer++;
        for (int it : adj.get(node)) {
            if (it == parent)
                continue;
            if (!vis[it]) {
                dfs(it, vis, tim, low, result, timer, adj, node);
                low[node] = Math.min(low[node], low[it]);

                if (low[it] > tim[node]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(node);
                    list.add(it);
                    result.add(list);
                }
            } else {
                low[node] = Math.min(low[node], tim[it]);
            }
        }
    }
}