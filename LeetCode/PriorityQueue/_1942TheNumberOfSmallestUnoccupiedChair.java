public class _1942TheNumberOfSmallestUnoccupiedChair {
    class Solution {
        public int smallestChair(int[][] times, int targetFriend) {
            int at = times[targetFriend][0];
            Arrays.sort(times, (a, b) -> a[0] - b[0]);
            PriorityQueue<Integer> Seats = new PriorityQueue<>();
            for (int i = 0; i < times.length; i++) {
                Seats.offer(i);
            }
            PriorityQueue<Pair<Integer, Integer>> occupiedSeats = new PriorityQueue<>(
                    (a, b) -> a.getValue() - b.getValue());
            for (int[] t : times) {
                while (occupiedSeats.size() > 0 && occupiedSeats.peek().getValue() <= t[0]) {
                    int s = occupiedSeats.poll().getKey();
                    Seats.offer(s);
                }
                if (at == t[0])
                    return Seats.peek();
                occupiedSeats.offer(new Pair(Seats.poll(), t[1]));
            }
            return 0;
        }
    }
}
