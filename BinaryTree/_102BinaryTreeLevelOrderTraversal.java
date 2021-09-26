public class _102BinaryTreeLevelOrderTraversal {
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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> l = new ArrayList<>();
            if (root == null)
                return l;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> currList = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    TreeNode currNode = q.poll();
                    currList.add(currNode.val);
                    if (currNode.left != null)
                        q.add(currNode.left);
                    if (currNode.right != null)
                        q.add(currNode.right);
                }
                l.add(currList);
            }
            return l;
        }
    }
}
