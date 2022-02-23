public class _207CourseSchedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            if (prerequisites.length == 0)
                return true;
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < numCourses; i++)
                adj.add(new ArrayList<Integer>());
            for (int[] p : prerequisites) {
                adj.get(p[0]).add(p[1]);
                if (p[0] == p[1])
                    return false;
            }
            int indegree[] = new int[numCourses];
            for (int i = 0; i < numCourses; i++) {
                for (Integer it : adj.get(i))
                    indegree[it]++;
            }

            Queue<Integer> q = new LinkedList<>();
            for (int i = 0; i < numCourses; i++) {
                if (indegree[i] == 0)
                    q.add(i);
            }
            int cnt = 0;
            while (!q.isEmpty()) {
                int node = q.poll();
                cnt++;
                for (Integer it : adj.get(node)) {
                    indegree[it]--;
                    if (indegree[it] == 0)
                        q.add(it);
                }
            }
            return cnt == numCourses;
        }
    }
}
