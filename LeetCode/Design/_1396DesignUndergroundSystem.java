public class _1396DesignUndergroundSystem {
    class UndergroundSystem {
        HashMap<Integer, Pair<String, Integer>> m1;
        HashMap<Pair<String, String>, List<Integer>> m2;

        public UndergroundSystem() {
            m1 = new HashMap<>();
            m2 = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            m1.putIfAbsent(id, new Pair<>(stationName, t));
        }

        public void checkOut(int id, String stationName, int t) {
            int diff = t - m1.get(id).getValue();
            Pair<String, String> p = new Pair<>(m1.get(id).getKey(), stationName);
            m1.remove(id);
            if (m2.get(p) == null) {
                List<Integer> l = new ArrayList<>();
                l.add(diff);
                m2.put(p, l);
            } else {
                m2.get(p).add(diff);
            }
        }

        public double getAverageTime(String startStation, String endStation) {
            Pair<String, String> p = new Pair<>(startStation, endStation);
            List<Integer> avg = m2.get(p);
            double sum = 0;
            for (Integer x : avg) {
                sum += x;
            }
            double av = sum / avg.size();
            return av;
        }
    }

    /**
     * Your UndergroundSystem object will be instantiated and called as such:
     * UndergroundSystem obj = new UndergroundSystem();
     * obj.checkIn(id,stationName,t);
     * obj.checkOut(id,stationName,t);
     * double param_3 = obj.getAverageTime(startStation,endStation);
     */
}
