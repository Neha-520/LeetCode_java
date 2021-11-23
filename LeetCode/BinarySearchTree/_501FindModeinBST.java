public class _501FindModeinBST {
    class Solution {
        Map<Integer, Integer> map = new HashMap();

        public int[] findMode(TreeNode root) {
            dfs(root);
            int max = Collections.max(map.values());

            List<Integer> list = new ArrayList();

            for (int key : map.keySet()) {
                if (map.get(key) == max)
                    list.add(key);
            }

            return list.stream().mapToInt(i -> i).toArray();
        }

        public void dfs(TreeNode root) {
            if (root == null)
                return;

            map.put(root.val, map.getOrDefault(root.val, 0) + 1);

            dfs(root.left);
            dfs(root.right);
        }
    }

    // ---------------------------------------
    class Solution2 {
        int maxCount = 1;

        public int[] findMode(TreeNode root) {
            Map<Integer, Integer> map = new HashMap<>();
            findMode(root, map);

            int[] result = new int[map.size()];
            int index = 0;
            for (Integer key : map.keySet()) {
                if (map.get(key) == maxCount)
                    result[index++] = key;
            }

            return Arrays.copyOf(result, index);
        }

        private void findMode(TreeNode root, Map<Integer, Integer> map) {
            if (root == null)
                return;
            else if (map.containsKey(root.val)) {
                int count = map.get(root.val) + 1;
                map.put(root.val, count);
                maxCount = Math.max(maxCount, count);
            } else
                map.put(root.val, 1);

            findMode(root.left, map);
            findMode(root.right, map);
        }
    }
}
