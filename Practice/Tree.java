
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Tree {
    Node root = null;

    class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            data = d;
            left = right = null;
        }
    }

    Node insertLevelOrder(int arr[], Node root, int i) {
        if (i < arr.length) {
            Node temp = new Node(arr[i]);
            root = temp;
            // System.out.println(root.data + " " + i);
            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
            // System.out.println(root.data + " " + i);
            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    void preorder(Node root) {
        if (root != null) {
            Node temp = root;
            System.out.print(temp.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void inorder(Node root) {
        if (root != null) {
            Node temp = root;
            inorder(root.left);
            System.out.print(temp.data + " ");
            inorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            Node temp = root;
            postorder(root.left);
            postorder(root.right);
            System.out.print(temp.data + " ");
        }
    }

    void zigzagTraversal(Node root) {
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.push(root);
        boolean ltr = false;
        while (!s1.isEmpty()) {
            Node temp = s1.pop();
            System.out.print(temp.data + " ");
            if (ltr) {
                if (temp.left != null)
                    s2.push(temp.left);
                if (temp.right != null)
                    s2.push(temp.right);
            } else {
                if (temp.right != null)
                    s2.push(temp.right);
                if (temp.left != null)
                    s2.push(temp.left);
            }
            if (s1.isEmpty()) {
                ltr = !ltr;
                Stack<Node> t = s1;
                s1 = s2;
                s2 = t;
            }
        }
    }

    void printLevelOrder(Node root) {
        if (root != null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (true) {
                int count = q.size();
                if (count == 0)
                    break;
                while (count-- > 0) {
                    Node temp = q.peek();
                    System.out.println(q.remove().data);
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                    // q.remove();
                }
            }
        }
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = t.insertLevelOrder(new int[] { 1, 2, 3, 4, 5, 6, 7 }, t.root, 0);
        // t.preorder(t.root);
        t.printLevelOrder(t.root);
        t.zigzagTraversal(t.root);
    }
}
