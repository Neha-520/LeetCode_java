public class _841KeysAndRooms {
    class Solution {
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            boolean[] vis = new boolean[rooms.size()];
            Queue<Integer> q = new LinkedList<>();
            q.offer(0);
            vis[0] = true;
            while (!q.isEmpty()) {
                int node = q.remove();
                for (int x : rooms.get(node)) {
                    if (!vis[x]) {
                        vis[x] = true;
                        q.offer(x);
                    }
                }
            }
            for (boolean b : vis)
                if (!b)
                    return false;
            return true;
        }
    }
}
