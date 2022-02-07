public class _169MajorityElement {
    class Solution {
        public int majorityElement(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int max = 0, k = 0;
            for (int n : nums) {
                if (!map.containsKey(n))
                    map.put(n, 1);
                else
                    map.put(n, map.get(n) + 1);
            }
            for (Map.Entry<Integer, Integer> m : map.entrySet()) {
                if (max < m.getValue()) {
                    max = m.getValue();
                    k = m.getKey();
                }
            }
            return k;
        }
    }

    // Moore Voters Algorithm wherm majority element occurs more than n/2 times
    class Solution {
        public int majorityElement(int[] nums) {
            int c = 0, can = 0;
            for (int i : nums) {
                if (c == 0)
                    can = i;
                if (i == can)
                    c += 1;
                else
                    c -= 1;
            }
            return can;
        }
    }
}
