public class _1860IncrementalMemoryLeak {
    class Solution {
        public int[] memLeak(int memory1, int memory2) {
            int i = 0;
            while (true) {
                if (memory1 < i && memory2 < i)
                    break;
                if (memory1 >= memory2 && memory1 >= i) {
                    memory1 -= i;
                } else if (memory2 >= i) {
                    memory2 -= i;
                }
                i++;
            }
            return new int[] { i, memory1, memory2 };
        }
    }
}
