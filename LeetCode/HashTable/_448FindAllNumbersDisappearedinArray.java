public class _448FindAllNumbersDisappearedinArray {

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            HashSet<Integer> hs = new HashSet<>();
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = 0; i < nums.length; i++)
                hs.add(nums[i]);
            for (int i = 1; i <= nums.length; i++)
                if (!hs.contains(i))
                    l.add(i);
            return l;
        }
    }

    // --------------------------
    class Solution2 {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            for (int i : nums) {
                int index = Math.abs(i);
                if (nums[index - 1] > 0)
                    nums[index - 1] *= -1;
            }
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0)
                    res.add(i + 1);
            }
            return res;
        }
    }
}
