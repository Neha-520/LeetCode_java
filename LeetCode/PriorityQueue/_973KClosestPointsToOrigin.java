public class _973KClosestPointsToOrigin {
    class Solution {
        public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> squaredDistance(b) - squaredDistance(a));

            for (int[] pt : points) {
                pq.offer(pt);
                if (pq.size() > k)
                    pq.poll();
            }
            int[][] res = new int[pq.size()][2];
            int count = 0;
            while (!pq.isEmpty())
                res[count++] = pq.poll();
            return res;
        }

        public int squaredDistance(int[] point) {
            return point[0] * point[0] + point[1] * point[1];
        }
    }

    // 2nd Solution---------------------------------------
    class Solution2 {
        public int[][] kClosest(int[][] points, int k) {
            Arrays.sort(points, (a, b) -> squaredDistance(a) - squaredDistance(b));

            return Arrays.copyOf(points, k);
        }

        public int squaredDistance(int[] point) {
            return point[0] * point[0] + point[1] * point[1];
        }
    }
}
