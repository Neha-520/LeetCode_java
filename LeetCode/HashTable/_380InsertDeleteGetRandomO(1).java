class RandomizedSet {
    HashSet<Integer> hs = new HashSet<>();

    public RandomizedSet() {

    }

    public boolean insert(int val) {
        if (hs.contains(val))
            return false;
        hs.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!hs.contains(val))
            return false;
        hs.remove(val);
        return true;
    }

    public int getRandom() {
        Integer[] a = hs.toArray(new Integer[hs.size()]);
        Random r = new Random();
        int rn = r.nextInt(hs.size());
        return a[rn];
    }
}