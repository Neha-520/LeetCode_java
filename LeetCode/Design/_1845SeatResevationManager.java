public class _1845SeatResevationManager {
    class SeatManager {
        PriorityQueue<Integer> p;

        public SeatManager(int n) {
            p = new PriorityQueue<>((a, b) -> a - b);
            for (int i = 1; i <= n; i++) {
                p.add(i);
            }
        }

        public int reserve() {
            return p.poll();
        }

        public void unreserve(int seatNumber) {
            p.add(seatNumber);
        }
    }

    /**
     * Your SeatManager object will be instantiated and called as such:
     * SeatManager obj = new SeatManager(n);
     * int param_1 = obj.reserve();
     * obj.unreserve(seatNumber);
     */
}
