package Arrays;

import java.util.Arrays;

public class _88MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = m, j = 0; i < nums1.length && j < nums2.length; i++, j++)
                nums1[i] = nums2[j];
            Arrays.sort(nums1);
        }
    }
}
