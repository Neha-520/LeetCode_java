public class _211DesignAddAndSearchWordsDataStructure {
    class WordDictionary {

        private class TrieNode {
            private TrieNode[] children = null;
            boolean isWord;

            public TrieNode() {
                children = new TrieNode[26];
            }
        }

        private TrieNode root;

        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            TrieNode it = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                int index = ch - 'a';
                if (it.children[index] == null) {
                    it.children[index] = new TrieNode();
                }
                it = it.children[index];
            }
            it.isWord = true;
        }

        public boolean search(String word) {
            return searchHelper(word, 0, root);
        }

        private boolean searchHelper(String word, int sIndex, TrieNode root) {
            if (word.length() == sIndex)
                return root.isWord;

            char ch = word.charAt(sIndex);
            if (ch == '.') {
                for (int i = 0; i < 26; i++) {
                    if (root.children[i] != null && searchHelper(word, sIndex + 1, root.children[i]))
                        return true;
                }
            } else {
                int index = ch - 'a';
                if (root.children[index] != null && searchHelper(word, sIndex + 1, root.children[index]))
                    return true;
            }
            return false;
        }
    }

    /**
     * Your WordDictionary object will be instantiated and called as such:
     * WordDictionary obj = new WordDictionary();
     * obj.addWord(word);
     * boolean param_2 = obj.search(word);
     */
}
