public class _705DesignHashSet {
    class MyHashSet {
        ArrayList<Integer> l;

        public MyHashSet() {
            l = new ArrayList<>();
        }

        public void add(int key) {
            if (!l.contains(key))
                l.add(key);
        }

        public void remove(int key) {
            if (l.contains(key))
                l.remove(new Integer(key));
        }

        public boolean contains(int key) {
            return l.contains(key);
        }
    }

}
