public class _4MedianOfTwoSortedArrays {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int merged[] = new int[nums1.length + nums2.length];
            int i = 0, j = 0, k = 0;
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j])
                    merged[k++] = nums1[i++];
                else
                    merged[k++] = nums2[j++];
            }
            while (i < nums1.length)
                merged[k++] = nums1[i++];
            while (j < nums2.length)
                merged[k++] = nums2[j++];
            double median = 0.0;
            if (merged.length % 2 == 1)
                median = merged[merged.length / 2];
            else
                median = (merged[merged.length / 2] + merged[merged.length / 2 - 1]) / 2.0;
            return median;
        }
    }
}
