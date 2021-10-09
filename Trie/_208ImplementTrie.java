public class _208ImplementTrie {
    class Trie {
        private class Node {
            char value;
            boolean isEndOfWord;
            HashMap<Character, Node> children = new HashMap<>();

            Node(char val) {
                this.value = val;
            }
        }

        private Node root = new Node(' ');

        public void insert(String word) {
            Node curr = root;
            for (char ch : word.toCharArray()) {
                if (!curr.children.containsKey(ch))
                    curr.children.put(ch, new Node(ch));
                curr = curr.children.get(ch);
            }
            curr.isEndOfWord = true;
        }

        public boolean search(String word) {
            Node curr = root;
            for (char ch : word.toCharArray()) {
                if (curr == null || !curr.children.containsKey(ch))
                    return false;
                curr = curr.children.get(ch);
            }
            return curr.isEndOfWord;
        }

        public boolean startsWith(String prefix) {
            Node curr = root;
            for (char ch : prefix.toCharArray()) {
                if (curr == null || !curr.children.containsKey(ch))
                    return false;
                curr = curr.children.get(ch);
            }
            return true;
        }
    }

    /**
     * Your Trie object will be instantiated and called as such: Trie obj = new
     * Trie(); obj.insert(word); boolean param_2 = obj.search(word); boolean param_3
     * = obj.startsWith(prefix);
     */
}
