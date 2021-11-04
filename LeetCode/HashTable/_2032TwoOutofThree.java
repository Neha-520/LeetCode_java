public class _2032TwoOutofThree {
    class Solution {
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
            List<Integer> l = new ArrayList();

            Set<Integer> set1 = new HashSet();
            Set<Integer> set2 = new HashSet();
            for (int num : nums1) {
                set1.add(num);
            }
            for (int num : nums2) {
                set2.add(num);
                if (set1.contains(num) && !l.contains(num))
                    l.add(num);
            }
            for (int num : nums3) {
                if ((set2.contains(num) && !l.contains(num)) || (set1.contains(num) && !l.contains(num)))
                    l.add(num);
            }
            return l;
        }
    }
}
