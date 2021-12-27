public class _1557MinimumNumberOfVerticesToReachAllNodes {
    class Solution {
        public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
            int indegree[] = new int[n];
            for (List<Integer> edge : edges) {
                indegree[edge.get(1)]++;
            }
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (indegree[i] == 0)
                    l.add(i);
            }
            return l;
        }
    }
}
