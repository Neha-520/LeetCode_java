
import java.util.ArrayList;
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

    class Pair {
        Node node;
        int state;

        Pair(Node node, int state) {
            this.node = node;
            this.state = state;
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

    void itrPreInPost(Node root) {
        Stack<Pair> s = new Stack<>();
        Pair rtp = new Pair(root, 1);
        s.push(rtp);
        String pre = "";
        String in = "";
        String post = "";

        while (s.size() > 0) {
            Pair top = s.peek();
            if (top.state == 1) { // pre,s++,left
                pre += top.node.data + " ";
                top.state++;

                if (top.node.left != null) {
                    Pair lp = new Pair(top.node.left, 1);
                    s.push(lp);
                }
            } else if (top.state == 2) {// in,s++,right
                in += top.node.data + " ";
                top.state++;

                if (top.node.right != null) {
                    Pair rp = new Pair(top.node.right, 1);
                    s.push(rp);
                }
            } else {// post,pop
                post += top.node.data + " ";
                s.pop();
            }

        }
        System.out.println(pre);
        System.out.println(in);
        System.out.println(post);
    }

    static ArrayList<Integer> path;

    boolean find(Node root, int data) {
        if (root == null)
            return false;
        if (root.data == data) {
            path.add(root.data);
            return true;
        }
        boolean filc = find(root.left, data);
        if (filc) {
            path.add(root.data);
            return true;
        }
        boolean firc = find(root.right, data);
        if (firc) {
            path.add(root.data);
            return true;
        }
        return false;
    }

    void printKLevelsDown(Node root, int k) {
        if (root == null || k < 0)
            return;
        if (k == 0)
            System.out.println(root.data);
        printKLevelsDown(root.left, k - 1);
        printKLevelsDown(root.right, k - 1);
    }

    void pathToLeafFromRoot(Node root, String path, int sum, int low, int high) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            sum += root.data;
            if (sum >= low && sum <= high)
                System.out.println(path + root.data);
            return;
        }
        pathToLeafFromRoot(root.left, path + root.data + " ", sum + root.data, low, high);
        pathToLeafFromRoot(root.right, path + root.data + " ", sum + root.data, low, high);
    }

    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = t.insertLevelOrder(new int[] { 1, 2, 3, 4, 5, 6, 7 }, t.root, 0);
        // t.preorder(t.root);
        t.printLevelOrder(t.root);
        t.zigzagTraversal(t.root);

        System.out.println();
        System.out.println();

        // ---------------------------
        // iteratice preorder postorder inorder
        Tree t1 = new Tree();
        t1.root = t1.insertLevelOrder(new int[] { 0, 1, 2, 3, 4, 5, 6 }, t1.root, 0);
        // t1.root = t1.insertLevelOrder(
        // new int[] { 50, 25, 12, 0, 0, 37, 30, 0, 0, 40, 0, 0, 75, 62, 60, 0, 0, 70,
        // 0, 0, 87, 0, 0 }, t1.root,
        // 0);
        t1.itrPreInPost(t1.root);

        // -----------------------------
        // node to root path
        path = new ArrayList<>();
        boolean found = t1.find(t1.root, 4);
        System.out.println(found);
        System.out.println(path);

        // ------------------------------
        // print klevel down
        t1.printKLevelsDown(t1.root, 2);

        // ------------------------------
        // print leaf to root path having sum in a given range
        t1.pathToLeafFromRoot(t1.root, "", 0, 1, 5);
    }
}
