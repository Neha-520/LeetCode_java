public class _239SlidingWindowMaximum {
    class Solution {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int[] nge = helper(nums);
            ArrayList<Integer> res = new ArrayList<>();
            int j = 0;
            for (int i = 0; i <= nums.length - k; i++) {
                if (j < i)
                    j = i;
                while (nge[j] < i + k) {
                    j = nge[j];
                }
                res.add(nums[j]);
            }
            int[] ans = new int[res.size()];
            for (int x = 0; x < ans.length; x++) {
                ans[x] = res.get(x);
            }
            return ans;
        }

        public int[] helper(int[] a) {
            Stack<Integer> s = new Stack<>();
            int[] nge = new int[a.length];
            s.push(0);
            for (int i = 0; i < a.length; i++) {
                if (a[i] > a[s.peek()] && !s.empty()) {
                    while (!s.empty() && a[i] >= a[s.peek()]) {
                        int y = s.pop();
                        nge[y] = i;
                    }
                }
                s.push(i);
            }
            for (int i = 0; i < nge.length; i++) {
                if (nge[i] == 0)
                    nge[i] = a.length;
            }
            return nge;
        }
    }
}
