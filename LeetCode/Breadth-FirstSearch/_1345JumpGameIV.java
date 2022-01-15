public class _1345JumpGameIV {
    class Solution {
        public int minJumps(int[] arr) {
            int n = arr.length;
            if (n == 1)
                return 0;

            Map<Integer, List<Integer>> map = new HashMap<>();
            int jump = 0;

            for (int i = 0; i < arr.length; i++) {
                map.computeIfAbsent(arr[i], l -> new ArrayList()).add(i);
            }
            Queue<Integer> q = new LinkedList<>();
            boolean[] vis = new boolean[arr.length];
            q.offer(0);

            while (!q.isEmpty()) {
                jump++;
                int size = q.size();
                while (size-- > 0) {
                    int j = q.poll();
                    if (j - 1 >= 0 && map.containsKey(arr[j - 1]) && !vis[j - 1]) {
                        q.offer(j - 1);
                    }
                    if (j + 1 < n && map.containsKey(arr[j + 1])) {
                        if (j + 1 == n - 1)
                            return jump;
                        q.offer(j + 1);
                    }
                    if (map.containsKey(arr[j])) {
                        for (int k : map.get(arr[j])) {
                            if (k != j && !vis[k]) {
                                if (k == n - 1)
                                    return jump;
                                q.offer(k);
                            }
                        }
                    }
                    map.remove(arr[j]);
                    vis[j] = true;
                }
            }
            return jump;
        }
    }
}
