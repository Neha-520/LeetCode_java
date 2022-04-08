public class _703KthLargestElementInStream {
    class KthLargest {
        static int k;
        PriorityQueue<Integer> heap;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            heap = new PriorityQueue<>();
            for (int num : nums)
                heap.offer(num);
            while (heap.size() > k)
                heap.poll();
        }

        public int add(int val) {
            heap.offer(val);
            if (heap.size() > k)
                heap.poll();
            return heap.peek();
        }
    }

}
