public class _698PartitiontoKEqualSumSubsets {
    class Solution {
        public boolean canPartitionKSubsets(int[] nums, int k) {
            int total = 0;
            for (int i : nums) {
                total += i;
            }
            if (nums.length < k || total % k != 0)
                return false;
            boolean[] visited = new boolean[nums.length];
            return helper(nums, visited, 0, k, 0, total / k);
        }

        public boolean helper(int nums[], boolean visited[], int start, int k, int currSum, int subsetSum) {
            if (k == 0)
                return true;
            if (currSum > subsetSum)
                return false;
            if (currSum == subsetSum)
                return helper(nums, visited, 0, k - 1, 0, subsetSum);
            for (int i = start; i < nums.length; i++) {
                if (visited[i])
                    continue;
                visited[i] = true;
                if (helper(nums, visited, i + 1, k, currSum + nums[i], subsetSum))
                    return true;
                visited[i] = false;
            }
            return false;
        }
    }
}
