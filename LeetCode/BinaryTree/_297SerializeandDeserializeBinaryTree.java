public class _297SerializeandDeserializeBinaryTree {

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null)
                return "";
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            StringBuilder sb = new StringBuilder();
            while (!q.isEmpty()) {
                int c = q.size();
                while (c-- > 0) {
                    TreeNode x = q.remove();
                    if (x == null) {
                        sb.append("#" + " ");
                        continue;
                    }
                    sb.append(x.val + " ");
                    q.add(x.left);
                    q.add(x.right);
                }
            }
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data == "")
                return null;
            Queue<TreeNode> q = new LinkedList<>();
            String[] s = data.split(" ");
            TreeNode root = new TreeNode(Integer.parseInt(s[0]));
            q.add(root);
            for (int i = 1; i < s.length; i++) {
                TreeNode parent = q.poll();
                if (!s[i].equals("#")) {
                    TreeNode left = new TreeNode(Integer.parseInt(s[i]));
                    parent.left = left;
                    q.add(left);
                }
                if (!s[++i].equals("#")) {
                    TreeNode right = new TreeNode(Integer.parseInt(s[i]));
                    parent.right = right;
                    q.add(right);
                }
            }
            return root;
        }
    }

}
