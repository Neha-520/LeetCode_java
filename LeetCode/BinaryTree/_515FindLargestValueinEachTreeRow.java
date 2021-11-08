public class _515FindLargestValueinEachTreeRow {
    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        ArrayList<Integer> l = new ArrayList<>();

        public List<Integer> largestValues(TreeNode root) {
            if (root != null) {
                Queue<TreeNode> q = new LinkedList<>();
                q.add(root);
                while (!q.isEmpty()) {
                    int max = Integer.MIN_VALUE;
                    int count = q.size();
                    while (count-- > 0) {
                        TreeNode x = q.peek();
                        max = Math.max(max, q.remove().val);
                        if (x.left != null)
                            q.add(x.left);
                        if (x.right != null)
                            q.add(x.right);
                    }
                    l.add(max);
                }
            }
            return l;
        }
    }
}
