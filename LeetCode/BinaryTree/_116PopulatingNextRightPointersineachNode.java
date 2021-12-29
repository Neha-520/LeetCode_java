package BinaryTree;

public class _116PopulatingNextRightPointersineachNode {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    class Solution {
        public Node connect(Node root) {
            if (root == null)
                return root;
            if (root.left != null)
                root.left.next = root.right;
            if (root.next != null && root.right != null)
                root.right.next = root.next.left;
            connect(root.left);
            connect(root.right);
            return root;
        }
    }

    class Solution2 {
        public Node connect(Node root) {
            if (root == null)
                return root;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int c = q.size();
                while (c-- > 0) {
                    Node x = q.remove();
                    if (c > 0)
                        x.next = q.peek();
                    else
                        x.next = null;
                    if (x.left != null)
                        q.add(x.left);
                    if (x.right != null)
                        q.add(x.right);
                }
            }
            return root;
        }
    }
}
