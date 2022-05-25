public class _2265CountNodesEqualToAverageOfSubtree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int averageOfSubtree(TreeNode root) {
            Queue<TreeNode> q = new LinkedList<>();
            inOrderAdd(root, q);
            int ans = 0;
            while (!q.isEmpty()) {
                TreeNode temp = q.poll();
                int[] arr = { 0, 0 };
                helper(temp, arr);
                int avg = arr[0] / arr[1];
                if (avg == temp.val)
                    ans++;
            }
            return ans;
        }

        public void inOrderAdd(TreeNode root, Queue<TreeNode> q) {
            if (root == null)
                return;
            inOrderAdd(root.left, q);
            q.add(root);
            inOrderAdd(root.right, q);
        }

        public void helper(TreeNode root, int[] arr) {
            if (root == null)
                return;
            helper(root.left, arr);
            arr[0] += root.val;
            arr[1]++;
            helper(root.right, arr);
        }
    }
}
