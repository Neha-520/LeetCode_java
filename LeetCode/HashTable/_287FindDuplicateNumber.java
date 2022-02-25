public class _287FindDuplicateNumber {
    class Solution {
        public int findDuplicate(int[] arr) {
            int n = arr.length;
            int freq[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                if (freq[arr[i]] == 0) {
                    freq[arr[i]] += 1;
                } else {
                    return arr[i];
                }
            }
            return 0;
        }
    }

    class Solution2 {
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
