public class _133CloneGraph {
    class Solution {
        public Node cloneGraph(Node node) {
            if (node == null)
                return null;
            Map<Node, Node> hm = new HashMap<>();
            Queue<Node> q = new LinkedList<>();
            q.add(node);
            hm.put(node, new Node(node.val, new ArrayList<>()));
            while (!q.isEmpty()) {
                Node c = q.poll();
                for (Node neighbour : c.neighbors) {
                    if (!hm.containsKey(neighbour)) {
                        hm.put(neighbour, new Node(neighbour.val, new ArrayList<>()));
                        q.add(neighbour);
                    }
                    hm.get(c).neighbors.add(hm.get(neighbour));
                }
            }
            return hm.get(node);
        }
    }
}
