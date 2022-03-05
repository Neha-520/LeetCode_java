public class _740DeleteAndEarn {

    class Solution4 {
        public int deleteAndEarn(int[] nums) {
            int[] dp = new int[10001];
            for (int num : nums)
                dp[num] += num;
            for (int i = 2; i < dp.length; i++)
                dp[i] = Math.max(dp[i] + dp[i - 2], dp[i - 1]);
            return dp[10000];
        }
    }

    class Solution {
        public int deleteAndEarn(int[] nums) {
            int[] f = new int[10002];
            int[] dp = new int[10002];
            for (int i = 0; i < nums.length; i++) {
                f[nums[i]]++;
            }
            dp[0] = 0;
            dp[1] = f[1] * 1;
            for (int i = 2; i < dp.length; i++) {
                dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * f[i]);
            }
            return dp[10001];
        }
    }

    class Solution3 {
        public int deleteAndEarn(int[] nums) {
            int count[] = new int[10001];

            for (int i : nums) {
                count[i]++;
            }

            int include = 0;
            int exclude = 0;

            for (int i = 0; i < 10001; i++) {
                int new_include = exclude + count[i] * i;
                int new_exclude = Math.max(include, exclude);
                include = new_include;
                exclude = new_exclude;
            }

            return Math.max(include, exclude);
        }
    }

    class Solution2 {
        public int deleteAndEarn(int[] nums) {
            Map<Integer, Integer> sumMap = new HashMap<>();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int ele : nums) {
                min = Integer.min(ele, min);
                max = Integer.max(ele, max);
                int eleSum = sumMap.getOrDefault(ele, 0);
                eleSum += ele;
                sumMap.put(ele, eleSum);
            }
            int[] count = new int[max - min + 1];
            for (int i = 0; i < count.length; ++i) {
                count[i] = sumMap.getOrDefault(min + i, 0);
            }
            int[] dp = new int[max - min + 1];

            return findMax(count, dp, max - min);
        }

        public int findMax(int[] count, int[] dp, int index) {
            if (index < 0)
                return 0;
            if (index == 0)
                return count[0];
            if (dp[index] != 0)
                return dp[index];
            else {
                dp[index] = Math.max(findMax(count, dp, index - 1),
                        count[index] + findMax(count, dp, index - 2));
                return dp[index];
            }
        }
    }
}
