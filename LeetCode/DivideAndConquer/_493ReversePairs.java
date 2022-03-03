public class _493ReversePairs {
    class Solution {
        public int reversePairs(int[] nums) {
            return divide(nums, 0, nums.length - 1);
        }

        int divide(int[] nums, int l, int r) {
            if (l >= r)
                return 0;
            int mid = l + (r - l) / 2;
            int c = divide(nums, l, mid);
            c += divide(nums, mid + 1, r);
            c += conq(nums, l, mid, r);
            return c;
        }

        int conq(int[] nums, int l, int mid, int r) {
            int count = 0;
            int j = mid + 1;
            for (int x = l; x <= mid; x++) {
                while (j <= r && nums[x] > (2 * (long) nums[j])) {
                    j++;
                }
                count += (j - (mid + 1));
            }
            ArrayList<Integer> temp = new ArrayList<>();
            int left = l, right = mid + 1;
            while (left <= mid && right <= r) {
                if (nums[left] <= nums[right])
                    temp.add(nums[left++]);
                else
                    temp.add(nums[right++]);
            }
            while (left <= mid) {
                temp.add(nums[left++]);
            }
            while (right <= r) {
                temp.add(nums[right++]);
            }
            for (int z = l; z <= r; z++) {
                nums[z] = temp.get(z - l);
            }
            return count;
        }
    }
}
