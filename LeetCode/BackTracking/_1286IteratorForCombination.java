public class _1286IteratorForCombination {
    class CombinationIterator {
        static Queue<String> q;

        public CombinationIterator(String characters, int combinationLength) {
            q = new LinkedList<>();
            generate(characters, 0, combinationLength, new StringBuilder());
        }

        void generate(String st, int s, int l, StringBuilder sb) {
            if (l == 0) {
                q.add((sb.toString()));
                return;
            }
            for (int i = s; i <= st.length() - 1; i++) {
                sb.append(st.charAt(i));
                generate(st, i + 1, l - 1, sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        public String next() {
            return q.poll();
        }

        public boolean hasNext() {
            return !q.isEmpty();
        }

    }

    /**
     * Your CombinationIterator object will be instantiated and called as such:
     * CombinationIterator obj = new CombinationIterator(characters,
     * combinationLength); String param_1 = obj.next(); boolean param_2 =
     * obj.hasNext();
     */
}
