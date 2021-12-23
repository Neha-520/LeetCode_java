public class _851LoudAndRich {
    class Solution {
        ArrayList<Integer>[] graph;
        int[] answer;
        int[] quiet;

        public int[] loudAndRich(int[][] richer, int[] quiet) {
            int n = quiet.length;
            graph = new ArrayList[n];
            answer = new int[n];
            this.quiet = quiet;

            for (int node = 0; node < n; ++node)
                graph[node] = new ArrayList<Integer>();

            for (int[] edge : richer)
                graph[edge[1]].add(edge[0]);

            Arrays.fill(answer, -1);
            for (int node = 0; node < n; node++) {
                dfs(node);
            }
            return answer;
        }

        public int dfs(int node) {
            if (answer[node] == -1) {
                answer[node] = node;
                for (int child : graph[node]) {
                    int cand = dfs(child);
                    if (quiet[cand] < quiet[answer[node]])
                        answer[node] = cand;
                }
            }
            return answer[node];
        }
    }
}
