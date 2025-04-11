public class _1860IncrementalMemoryLeak {
    class Solution {
int m;
        Solution(int mem) {
            this.m = mem;
        }

        public String toString() {
            return m;
        }
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

    public class sum{
        public static void main(String[] args) {
            Solution s = new Solution(23);
            
            System.out.println(s);
        }
    }
}


