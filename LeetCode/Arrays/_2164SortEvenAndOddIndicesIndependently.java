public class _2164SortEvenAndOddIndicesIndependently {
    class Solution {
        public int[] sortEvenOdd(int[] nums) {
            ArrayList<Integer> o = new ArrayList<>();
            ArrayList<Integer> e = new ArrayList<>();
            for (int i = 1; i < nums.length; i += 2) {
                o.add(nums[i]);
            }
            for (int i = 0; i < nums.length; i += 2) {
                e.add(nums[i]);
            }
            Collections.sort(o, Collections.reverseOrder());
            Collections.sort(e);
            int it = 0;
            for (int i = 0; i < nums.length; i++) {
                if (it < nums.length)
                    nums[it++] = e.get(i);
                if (it < nums.length)
                    nums[it++] = o.get(i);
            }
            return nums;
        }
    }
}
