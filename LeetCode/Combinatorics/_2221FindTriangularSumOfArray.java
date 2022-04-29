public class _2221FindTriangularSumOfArray {
    class Solution {
        public int triangularSum(int[] nums) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int n : nums)
                l.add(n);
            while (l.size() > 1) {
                ArrayList<Integer> x = new ArrayList<>();
                for (int i = 1; i < l.size(); i++) {
                    x.add((l.get(i) + l.get(i - 1)) % 10);
                }
                l = x;
            }
            return l.get(0);
        }
    }

    class Solution {
        public int triangularSum(int[] nums) {

            int n = nums.length;
            while (n > 1) {
                for (int i = 0; i < n - 1; i++)
                    nums[i] = (nums[i] + nums[i + 1]) % 10;
                n--;
            }
            return nums[0];
        }
    }
}
