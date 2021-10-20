package BinarySearch;

public class _167TwoSumIIinputarrayIsSorted {
    class Solution {
        public int[] twoSum(int[] arr, int target) {
            int i = 0, j = arr.length - 1;
            while (j > i) {
                if (arr[i] + arr[j] == target)
                    break;
                else if (arr[i] + arr[j] > target)
                    j--;
                else if (arr[i] + arr[j] < target)
                    i++;
            }
            return new int[] { i + 1, j + 1 };
        }
    }
}
