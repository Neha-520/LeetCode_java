public class _1010PairOfSongsWithTotalDurationsDivisibleBy60 {

    class Solution1 {
        public int numPairsDivisibleBy60(int[] time) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            int c = 0;
            for (int t : time) {
                if (t % 60 == 0)
                    c += hm.getOrDefault(0, 0);
                else
                    c += hm.getOrDefault(60 - t % 60, 0);
                hm.put(t % 60, hm.getOrDefault(t % 60, 0) + 1);
            }
            return c;
        }
    }

    class Solution2 {
        public int numPairsDivisibleBy60(int[] time) {
            int array[] = new int[60];
            int retVal = 0;
            for (int i : time) {
                int n = i % 60;
                retVal += array[n == 0 ? 0 : 60 - n];
                array[n]++;
            }
            return retVal;
        }
    }

    class Solution3 {
        public int numPairsDivisibleBy60(int[] times) {
            int[] modTimes = new int[60];
            for (int songTime : times)
                modTimes[songTime % 60]++;

            int totalPairs = 0;
            totalPairs += findPairs(modTimes[0]);
            totalPairs += findPairs(modTimes[30]);

            for (int i = 1; i <= 29; i++)
                totalPairs += modTimes[i] * modTimes[60 - i];

            return totalPairs;
        }

        public int findPairs(int n) {
            return n * (n - 1) / 2;
        }
    }
}
