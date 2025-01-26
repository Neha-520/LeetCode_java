class Solution {
    private int kahnsTopologicalSort(int[] adj, int[] indegree, boolean[] visited, int source) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        int lastNode = -1;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            visited[curr] = true;
            lastNode = curr;

            int neighbor = adj[curr];
            indegree[neighbor]--;
            if (indegree[neighbor] == 0 && !visited[neighbor]) {
                queue.offer(neighbor);
            }
        }
        return adj[lastNode];
    }

    private int maxDepthBFS(List<List<Integer>> reverseAdj, boolean[] origVisited, int n, int source, int avoid) {
        boolean[] visited = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;
        visited[avoid] = true;

        int levels = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int curr = queue.poll();
                origVisited[curr] = true;

                for (int neighbor : reverseAdj.get(curr)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
            levels++;
        }
        return levels;
    }

    private int bfs(int[] adj, boolean[] visited, int source) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        visited[source] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();

            if (!visited[adj[curr]]) {
                visited[adj[curr]] = true;
                queue.offer(adj[curr]);
            }
            count++;
        }
        return count;
    }

    public int maximumInvitations(int[] adj) {
        int n = adj.length;
        List<List<Integer>> reverseAdj = new ArrayList<>();
        for (int i = 0; i < n; i++) reverseAdj.add(new ArrayList<>());
        int[] indegree = new int[n];

        for (int i = 0; i < n; i++) {
            reverseAdj.get(adj[i]).add(i);
            indegree[adj[i]]++;
        }

        int totalTailLen = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0 && !visited[i]) {
                int node = kahnsTopologicalSort(adj, indegree, visited, i);
                if (adj[adj[node]] == node) {
                    int lenTail = maxDepthBFS(reverseAdj, visited, n, node, adj[node]) - 1;
                    totalTailLen += lenTail;
                    visited[node] = false;
                }
            }
        }

        int twoSizeCycles = 0;
        int maxCycleSize = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int cycleSize = bfs(adj, visited, i);
                if (cycleSize == 2) {
                    twoSizeCycles++;
                } else {
                    maxCycleSize = Math.max(maxCycleSize, cycleSize);
                }
            }
        }

        int cycleSize2 = totalTailLen + 2 * twoSizeCycles;
        return Math.max(cycleSize2, maxCycleSize);
    }
}
