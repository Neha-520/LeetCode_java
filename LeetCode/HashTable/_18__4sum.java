public class _18__4sum {
    class Solution {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            Set<List<Integer>> l = new HashSet<>();
            if (nums.length == 0)
                return new ArrayList<>(l);
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 3; i++) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    int m = j + 1;
                    int k = nums.length - 1;
                    while (m < k) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[m];
                        if (sum == target)
                            l.add(Arrays.asList(nums[i], nums[j], nums[m++], nums[k--]));
                        else if (sum > target)
                            k--;
                        else
                            m++;
                    }
                }
            }
            return new ArrayList<>(l);
        }
    }
}
