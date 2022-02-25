package Arrays;

import java.util.Arrays;

public class _88MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n == 0)
                return;
            for (int i = 0; i < m; i++) {
                if (nums1[i] > nums2[0]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[0];
                    nums2[0] = temp;
                }
                int f = nums2[0];
                int k = 0;
                for (int j = 1; j < n && nums2[j] < f; j++) {
                    nums2[j - 1] = nums2[j];
                    k = j;
                }
                nums2[k] = f;
            }
            int j = 0;
            for (int i = m; i < m + n; i++) {
                nums1[i] = nums2[j++];
            }
        }
    }

    class Solution2 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = m, j = 0; i < nums1.length && j < nums2.length; i++, j++)
                nums1[i] = nums2[j];
            Arrays.sort(nums1);
        }
    }
}
