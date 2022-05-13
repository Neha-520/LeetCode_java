public class _752OpenTheLock {
    class Solution {
        Set<String> vis = new HashSet<>();

        public int openLock(String[] deadends, String target) {
            if (target == null || target.length() == 0)
                return -1;
            for (String s : deadends)
                vis.add(s);
            Queue<String> q = new LinkedList<>();
            q.add("0000");
            int level = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                while (size-- > 0) {
                    String curr = q.remove();
                    if (vis.contains(curr))
                        continue;
                    if (curr.equals(target))
                        return level;
                    for (String next : helper(curr)) {
                        if (!vis.contains(next))
                            q.offer(next);
                    }
                    vis.add(curr);
                }
                level++;
            }
            return -1;
        }

        public Set<String> helper(String curr) {
            Set<String> s = new HashSet<>();
            char[] arr = curr.toCharArray();
            for (int i = 0; i < 4; i++) {
                char c = arr[i];
                arr[i] = c == '9' ? '0' : (char) (c + 1);
                s.add(new String(arr));
                arr[i] = c == '0' ? '9' : (char) (c - 1);
                s.add(new String(arr));
                arr[i] = c;
            }
            return s;
        }
    }
}
