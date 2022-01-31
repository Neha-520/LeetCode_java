public class _287FindDuplicateNumber {
    class Solution {
        public int findDuplicate(int[] nums) {
            HashSet<Integer> hs = new HashSet<>();
            for (int n : nums) {
                if (hs.contains(n))
                    return n;
                hs.add(n);
            }
            return 0;
        }
    }
}
