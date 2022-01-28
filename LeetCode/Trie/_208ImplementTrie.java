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

    /// .....................................................
    // using array
    class Trie {
        private TrieNode root;

        private class TrieNode {
            private TrieNode[] children = null;
            private boolean isWord = false;

            public TrieNode() {
                children = new TrieNode[26];
            }
        }

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode it = root;
            for (char ch : word.toCharArray()) {
                int indexInTrieNode = ch - 'a';
                if (it.children[indexInTrieNode] == null) {
                    it.children[indexInTrieNode] = new TrieNode();
                }
                it = it.children[indexInTrieNode];
            }
            it.isWord = true;
        }

        public boolean search(String word) {
            TrieNode it = root;
            for (char ch : word.toCharArray()) {
                int indexInTrieNode = ch - 'a';
                if (it.children[indexInTrieNode] == null) {
                    return false;
                } else {
                    it = it.children[indexInTrieNode];
                }
            }
            return it.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode it = root;
            for (char ch : prefix.toCharArray()) {
                int indexInTrieNode = ch - 'a';
                if (it.children[indexInTrieNode] == null) {
                    return false;
                } else {
                    it = it.children[indexInTrieNode];
                }
            }
            return true;
        }
    }
}
